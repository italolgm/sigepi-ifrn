
package views.html.Professor

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object listaProfessores extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Usuario],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(professores: List[Usuario]):play.api.templates.Html = {
        _display_ {import tags._

import helper._

import helpers.Seguranca.InformacoesUsuarioHelper._


Seq[Any](format.raw/*1.30*/("""

"""),format.raw/*6.1*/("""

"""),_display_(Seq[Any](/*8.2*/main/*8.6*/ {_display_(Seq[Any](format.raw/*8.8*/("""


<div class="row">
		<div class="span12">
			<div class="page-header" style="overflow:hidden;">
				<h1 style="float:left;">Listagem dos Professores</h1>
				
				<div style="float:right; position:relative; top:8px;">
					<a href=""""),_display_(Seq[Any](/*17.16*/routes/*17.22*/.Professores.formulario)),format.raw/*17.45*/("""" class="btn"><i class="icon-plus"></i> Cadastrar Novo Professor</a>
				</div>
			</div>
			
			
			
			"""),_display_(Seq[Any](/*23.5*/if(professores.size == 0)/*23.30*/ {_display_(Seq[Any](format.raw/*23.32*/("""
				<h3>Nenhum Professor cadastrado.</h3>			
			""")))}/*25.6*/else/*25.11*/{_display_(Seq[Any](format.raw/*25.12*/("""
				<table class="table table-bordered table-condensed table-striped">
	              <thead>
	                <tr>
	                  <th>Nome</th>
	                  <th>Email</th>
	                  <th>Login</th>
	                  <th>Campus</th>
	                  <th>Ações</th>
	                </tr>
	              </thead>
	              <tbody>
                	"""),_display_(Seq[Any](/*37.19*/for(professor <- professores) yield /*37.48*/ {_display_(Seq[Any](format.raw/*37.50*/("""
	                <tr>
                		<td>"""),_display_(Seq[Any](/*39.24*/professor/*39.33*/.nome)),format.raw/*39.38*/("""</td>
                		<td>"""),_display_(Seq[Any](/*40.24*/professor/*40.33*/.email)),format.raw/*40.39*/("""</td>
                		<td>"""),_display_(Seq[Any](/*41.24*/professor/*41.33*/.login)),format.raw/*41.39*/("""</td>
                		<td>"""),_display_(Seq[Any](/*42.24*/professor/*42.33*/.campus.getNome)),format.raw/*42.48*/("""</td>
						<td style="width:15%;">
							<a href=""""),_display_(Seq[Any](/*44.18*/routes/*44.24*/.Professores.formularioEdicao(professor.id))),format.raw/*44.67*/("""" class="btn btn-small"><i class="icon-edit"></i> Editar</a>
							<a href=""""),_display_(Seq[Any](/*45.18*/routes/*45.24*/.Professores.deletar(professor.id))),format.raw/*45.58*/("""" onclick="return confirm('Deseja realmente excluir o professor &quot;"""),_display_(Seq[Any](/*45.129*/professor/*45.138*/.nome)),format.raw/*45.143*/("""&quot;?')" class="btn btn-small"><i class="icon-remove"></i> Excluir</a>
						</td>
	                </tr>
					""")))})),format.raw/*48.7*/("""
	              </tbody>
	            </table>
			""")))})),format.raw/*51.5*/("""
		</div>
	</div>	

""")))})))}
    }
    
    def render(professores:List[Usuario]) = apply(professores)
    
    def f:((List[Usuario]) => play.api.templates.Html) = (professores) => apply(professores)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jan 05 16:47:09 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/Professor/listaProfessores.scala.html
                    HASH: 5e1f29226006fb9832c7a4e63cc15e8b828c0567
                    MATRIX: 783->1|975->29|1005->121|1044->126|1055->130|1093->132|1373->376|1388->382|1433->405|1580->517|1614->542|1654->544|1724->597|1737->602|1776->603|2199->990|2244->1019|2284->1021|2368->1069|2386->1078|2413->1083|2479->1113|2497->1122|2525->1128|2591->1158|2609->1167|2637->1173|2703->1203|2721->1212|2758->1227|2849->1282|2864->1288|2929->1331|3044->1410|3059->1416|3115->1450|3223->1521|3242->1530|3270->1535|3418->1652|3503->1706
                    LINES: 27->1|35->1|37->6|39->8|39->8|39->8|48->17|48->17|48->17|54->23|54->23|54->23|56->25|56->25|56->25|68->37|68->37|68->37|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|75->44|75->44|75->44|76->45|76->45|76->45|76->45|76->45|76->45|79->48|82->51
                    -- GENERATED --
                */
            