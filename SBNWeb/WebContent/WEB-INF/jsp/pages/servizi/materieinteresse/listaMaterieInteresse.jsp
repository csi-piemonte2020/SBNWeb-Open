<%@ taglib uri="http://struts.apache.org/tags-html-el" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean-el" prefix="bean"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt"      prefix="c"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean"  prefix="bs"%>
<%@ taglib uri="http://common.web.sbn.iccu.it/sbn" prefix="sbn"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="layout"%>

<html:xhtml />
<layout:page>
	<sbn:navform action="/servizi/materieinteresse/ListaMaterieInteresse.do">
		<div id="divForm">
			<div id="divMessaggio">
				<sbn:errors bundle="serviziMessages" />

			</div>
			<br>

			<c:if test="${not empty navForm.listaMaterie}">

				<sbn:blocchi numNotizie="totRighe" numBlocco="bloccoSelezionato"
							elementiPerBlocco="maxRighe" totBlocchi="totBlocchi"
							parameter="methodListaMaterie">
				</sbn:blocchi>
				<table class="sintetica">
					<tr>
						<th width="4%" class="etichetta" style="text-align:center;" scope="col" bgcolor="#dde8f0">
							n.
						</th>
						<!--
						<th class="etichetta" scope="col" bgcolor="#dde8f0" style="text-align:center;">
							<bean:message key="servizi.utenti.headerBiblioteca" bundle="serviziLabels" />
						</th>
						-->
						<th th width="4%" class="etichetta" scope="col" bgcolor="#dde8f0" style="text-align:center;">
							<bean:message key="servizi.materieinteresse.header.codMateria" bundle="serviziLabels" />
						</th>
						<th class="etichetta" scope="col" bgcolor="#dde8f0" style="text-align:center;">
							<bean:message key="servizi.materieinteresse.header.desMateria" bundle="serviziLabels" />
						</th>
						<!--
						<th class="etichetta" scope="col" bgcolor="#dde8f0" style="text-align:center;">
							<bean:message key="servizi.utenti.headerSelezionata" bundle="serviziLabels" />
						</th>
						-->
						<th th width="4%" class="etichetta" scope="col" bgcolor="#dde8f0" style="text-align:center;">
							<bean:message key="servizi.utenti.headerSelezionataMultipla" bundle="serviziLabels" />
						</th>
					</tr>
					<logic:iterate id="item" property="listaMaterie" name="navForm" indexId="indEle">
						<sbn:rowcolor var="color" index="indEle" />

						<tr bgcolor="${color}" >
							<td class="testoNoBold" style="text-align:center;">
								<sbn:linkbutton index="idMateria" name="item"
								value="progressivo" key="servizi.bottone.esaminaOne"
								bundle="serviziLabels" title="esamina" property="codSelMateriaSing"
								disabled="${navForm.conferma}" />
							</td>
							<!--
							<td class="testoNoBold" style="text-align:center;">
								<sbn:anchor name="item" property="progressivo" />
								<bs:write name="item" property="codBib" />
							</td>
							-->
							<td class="testoNoBold" style="text-align:center;">
								<bs:write name="item" property="codice" />
							</td>
							<td class="testoNoBold">
								<bs:write name="item" property="descrizione" />
							</td>
							<!--
							<td class="testoNoBold" style="text-align:center;">
								<html:radio property="codSelMateriaSing" value="${indEle}"
											style="text-align:center;"
											disabled="${navForm.conferma}" />
							</td>
							-->
							<td class="testoNoBold" style="text-align:center;">
								<html:multibox property="codSelMateria" value="${listaMat.idMateria}"
												style="text-align:center;"
												disabled="${navForm.conferma}" />
							</td>
						</tr>
					</logic:iterate>
				</table>
			</div>

			<div id="divFooterCommon">
				<sbn:blocchi numNotizie="totRighe" numBlocco="bloccoSelezionato"
								elementiPerBlocco="maxRighe" totBlocchi="totBlocchi"
								parameter="methodListaMaterie" bottom="true" >
				</sbn:blocchi>
			</div>
			<br/>
			<br/>
		</c:if>

		<div id="divFooter">
			<c:choose>
				<c:when test="${navForm.conferma}">
					<jsp:include
						page="/WEB-INF/jsp/subpages/servizi/utility/confermaOperazione.jsp" />
				</c:when>
				<c:otherwise>
					<jsp:include
						page="/WEB-INF/jsp/subpages/servizi/materieinteresse/footerListaMaterieInteresse.jsp" />
				</c:otherwise>
			</c:choose>
		</div>
	</sbn:navform>
</layout:page>

