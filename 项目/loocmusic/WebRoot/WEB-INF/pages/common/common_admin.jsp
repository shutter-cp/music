<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<c:forEach items="${adminMagazineList}" var="adminMagazine">
	<tr>
		<td class="collapsing">
			<div class="ui fitted test  slider checkbox">
				<c:if test="${adminMagazine.getApproval()==1}">
					<input type="checkbox"  checked="checked"
						onclick="off(${adminMagazine.getMagazineID()})" 
							><label></label>
				</c:if>
				<c:if test="${adminMagazine.getApproval()==0}">
					<input type="checkbox"
						onclick="on(${adminMagazine.getMagazineID()})" 
							><label></label>
				</c:if>
			</div>
		</td>
		<td>${adminMagazine.getMagazineID()}</td>
		<td>${adminMagazine.getTitle()}</td>
		<td>${adminMagazine.getMusicID()}</td>
		<td>${adminMagazine.getCommentTimes()}</td>
		<td>${adminMagazine.getWeight()}</td>
		<td>
			<c:if test="${adminMagazine.getApproval()==1}">
				是
			</c:if>
			<c:if test="${adminMagazine.getApproval()==0}">
				否
			</c:if>
		</td>
		<td>
			<a onclick="delet(${adminMagazine.getMagazineID()})">
				<i class="Remove Circle large  icon red"></i>
			</a>
		</td>
		
	</tr>
</c:forEach>