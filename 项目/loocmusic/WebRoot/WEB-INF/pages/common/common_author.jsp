<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<c:forEach items="${authorMagazineList}" var="authorMagazine">
<tr>
	<td class="collapsing">
		<div class="ui fitted test  slider checkbox">
			<div class="ui fitted test  slider checkbox">
				<c:if test="${authorMagazine.getApproval()==1}">
					<input type="checkbox"  checked="checked"
						onclick="off(${authorMagazine.getMagazineID()})" 
							><label></label>
				</c:if>
				<c:if test="${authorMagazine.getApproval()==0}">
					<input type="checkbox"
						onclick="on(${authorMagazine.getMagazineID()})" 
							><label></label>
				</c:if>
			</div>
		</div>
	</td>
	<td>${authorMagazine.getMagazineID()}</td>
	<td>${authorMagazine.getTitle()}</td>
	<td>${authorMagazine.getMusicID()}</td>
	<td>${authorMagazine.getCommentTimes()}</td>
	<td>${authorMagazine.getWeight()}</td>
	<td>
		<c:if test="${authorMagazine.getApproval()==1}">
			是
		</c:if>
		<c:if test="${authorMagazine.getApproval()==0}">
				否
			</c:if>
		</td>
	</tr>
</c:forEach>