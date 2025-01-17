var video = (url('?id') != null) ? url('?id') : '';
					var totalLength;
					var maxImg;
					var videoPath;
					function videoPointAdd(){
						var timepoint = document.getElementById("videoTag").currentTime;
						$("#addButton").attr("href","../views/videoPointAdd.html?video="+video+"&timepoint="+timepoint);
					}
				
					function thumbnailEdit(){
						var timepoint = document.getElementById("videoTag").currentTime;
						$.get("../views/videoinfo/changeThumbnail?video="+video+"&timepoint="+timepoint, function(r){
							
						})
					}
					
					$(".btn-create").colorbox({
						iframe : true,
						width : "860px",
						height : "700px",
						opacity : '0.5',
						overlayClose : false,
						escKey : true
					});
					$(document).ready(
						function() {
							$.get('../front/admin/videoinfo!execute?uid=g0003&id='+video,function(r) {
								if(r.status =='success') {
									var videoHtml = '';
									videoHtml += '<b onclick="ZeppinVideo_TopB(this)"></b>';
									videoHtml += '<video id="videoTag"><source id="videoSource" src="..'+r.data.originalVideoUrl+'">';
									videoHtml += '您的版本不支持该视频播放，请更换浏览器或者升级浏览器版本</video>';
									$('#ZeppinVideo_Top').html(videoHtml);
									$('#videoTitle').html(r.data.title);
									Video=document.getElementById("videoTag");
									ClickVideo(document.getElementById("videoTag"));
									totalLength=r.data.timeLengthSecond;
									maxImg = (totalLength - totalLength%5) / 5 + 1;
									videoPath = r.data.video;
									if (maxImg>=6){
										for(var i=1;i<7;i++){
											$('#iframeImg_'+i).attr("src",".."+r.data.video+'frames/'+(i+1)+".jpg");
											$('#iframeImg_'+i).attr("name",(i+1));
											var second=0,minute=0;
											var iframeSecond = (i-1)*5;
											if(iframeSecond>=60){
												second = iframeSecond%60;
												minute = (iframeSecond-second)/60;
											}else{
												second = iframeSecond;
												minute = 0;
											}
											if(second<10){
												$('#iframeSpan_'+i).html(minute+":0"+second);
											}else{
												$('#iframeSpan_'+i).html(minute+":"+second);
											}
											$('#iframeSpan_'+i).attr("name",iframeSecond);
										}
									}else{
										for(var i=1;i<7;i++){
											if(i<=maxImg){
												$('#iframeImg_'+i).attr("src",".."+r.data.video+'frames/'+(i+1)+".jpg");
												$('#iframeImg_'+i).attr("name",(i+1)+"");
												var second=0,minute=0;
												var iframeSecond = (i-1)*5;
												if(iframeSecond>=60){
													second = iframeSecond%60;
													minute = (iframeSecond-second)/60;
												}else{
													second = iframeSecond;
													minute = 0;
												}
												if(second<10){
													$('#iframeSpan_'+i).html(minute+":0"+second);
												}else{
													$('#iframeSpan_'+i).html(minute+":"+second);
												}
												$('#iframeSpan_'+i).attr("name",iframeSecond);
											}else{
												
											}
										}
									}
								}				
							}).done(function(){
								getList();
								if(maxImg>=6){
									setInterval("imageProgress()",500);
								}
							});
					})
					
					function getList(){
						$.get('../front/admin/videoCommodityPoint!execute?uid=e0001&sorts=createtime desc&video='+ video,function(r) {
							if(r.status =='success' && r.data.length > 0) {
								var tableHtml = '<tr><th width="15%">帧位图</th><th width="10%">时间点</th><th width="15%">关联商品信息</th><th width="15%">提示文字</th><th width="10%">创建人</th><th width="15%">创建时间</th><th width="8%">操作</th></tr>';
								var pointHtml = ''
								$.each(r.data,function(i,v){
									tableHtml += '<td><img src="..'+ v.iframePath +'" alt="帧位图"></td>';
									tableHtml += '<td>'+v.timepoint+'</td><td>'+v.commodityName+'</td>';
									tableHtml += '<td>'+v.showMessage+'</td><td>'+v.creatorName+'</td>';
									tableHtml += '<td>'+v.createtimeCN+'</td>';
									tableHtml += '<td class="operation"><a class="btn-edit" href="../views/videoPointEdit.html?id='+v.id+'">编辑</a>';
									tableHtml += '<a onclick="changeStatus(this)" data-url="../front/admin/videoCommodityPoint!execute?uid=e0006&id='+v.id+'">删除</a></td></tr>';
									
									var rate = v.timepointSecond/totalLength*100;
									pointHtml += '<i class="node node1" style="left:'+rate+'%"><p class="nodeintro"><img src="../'+ v.iframePath +'" alt="'+v.showMessage+'"></p></i>'
								})
								$('#pointTable').html(tableHtml);
								$('#progressPoint').html(pointHtml);
								$(".ZeppinVideo .ZeppinVideo_Bottom .Progress .progressQQ i.node").hover(function(){
									$(this).find("p").stop().fadeIn(500);
								},function(){
									$(this).find("p").stop().fadeOut(500);
								});
								$(".btn-edit").colorbox({
									iframe : true,
									width : "860px",
									height : "700px",
									opacity : '0.5',
									overlayClose : false,
									escKey : true
								});
							}else{
								$('#pointTable').html("没有商品关联信息");	
								$('#progressPoint').html("");
							}
						})
					};
					function imageProgress(){
						var timepoint = document.getElementById("videoTag").currentTime;
						var lImg = $('#iframeImg_1').attr("name");
						var fistImg = (timepoint-timepoint%5)/5 + 2;
						if(fistImg != lImg){
							var imgNum =((totalLength - timepoint)-(totalLength - timepoint)%5) / 5 + 1;
							if (imgNum>=5){
								for(var i=1;i<7;i++){
									$('#iframeImg_'+i).attr("src",".."+videoPath+'frames/'+(fistImg+i-1)+".jpg");
									$('#iframeImg_'+i).attr("name",(fistImg+i-1)+"");
									var second=0,minute=0;
									var iframeSecond = (fistImg+i-3)*5;
									if(iframeSecond>=60){
										second = iframeSecond%60;
										minute = (iframeSecond-second)/60;
									}else{
										second = iframeSecond;
										minute = 0;
									}
									if(second<10){
										$('#iframeSpan_'+i).html(minute+":0"+second);
									}else{
										$('#iframeSpan_'+i).html(minute+":"+second);
									}
									$('#iframeSpan_'+i).attr("name",iframeSecond);
								}
							}
						}
					}
					
					function changeStatus(t) {
						var obj = $(t),cUrl = obj.attr('data-url');
						$.getJSON(cUrl, function(ret) {
							if (ret.status == 'success') {
								getList();
							} else {
								alert('失败,' + ret.message);
							}
						})
						return false;
					}