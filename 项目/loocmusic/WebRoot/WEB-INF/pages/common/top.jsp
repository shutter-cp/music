<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!--导航栏-->
		<div class="ui menu fixed animated fadeInDown">
			<!--顶部滚动-->
			<div class="title-top" style="width:0"></div>
			<!--菜单-->
			<div class="title-in">
				<div class="ui menu secondary">
					<div class="ui image logo very padded">
						<a href="${basePath}/index">
							<img src="${basePath}/img/index/logo.png"/>
						</a>
					</div>
					<a href="${basePath}/magazinelist" class="ui item">期刊</a>
					<a href="${basePath}/music" class="ui item">单曲</a>
					<a href="${basePath}/style" class="ui item">分类</a>
					<!-- 查询 -->
					<form id="none" action="${basePath}/fond" method="post">
						<div class="ui icon input" style="height:40px; position:absolute;margin-top: 0.2%">
							<input type="text" name="string" placeholder="Searhc..."  />
							<button class="ui icon button" type="submit">
								<i class="search link icon"></i>
							</button>
						</div>
					</form>
					<div class="right menu">
						<c:if test="${user == null}">
							<a href="${basePath}/login">
								<button type="button" class="ui button inverted blue" style="height:45px;">
									登录/注册
								</button>
							</a>
						</c:if>
						<c:if test="${user != null}">
							<button type="button" class="ui button inverted blue">
								欢迎：${user.getUsername()}
							</button>
							<a id="none" href="${basePath}/loginOut">
								<button type="button" class="ui button inverted blue" style="height:45px;">
									退出登录
								</button>
							</a>
						</c:if>
					</div>
				</div>
			</div>
		</div>