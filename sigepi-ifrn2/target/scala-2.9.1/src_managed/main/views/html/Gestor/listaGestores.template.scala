
package views.html.Gestor

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
object listaGestores extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Usuario],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(gestores: List[Usuario]):play.api.templates.Html = {
        _display_ {import tags._

import helper._

import helpers.Seguranca.InformacoesUsuarioHelper._


Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*6.1*/("""

"""),_display_(Seq[Any](/*8.2*/main/*8.6*/ {_display_(Seq[Any](format.raw/*8.8*/("""



<div class="row">
		<div class="span12">
			<div class="page-header" style="overflow:hidden;">
				<h1 style="float:left;">Listagem dos Gestores</h1>
				
				<div style="float:right; position:relative; top:8px;">
					<a href=""""),_display_(Seq[Any](/*18.16*/routes/*18.22*/.Gestores.formulario)),format.raw/*18.42*/("""" class="btn"><i class="icon-plus"></i> Cadastrar Novo Gestor</a>
				</div>
			</div>
			
			
			
			"""),_display_(Seq[Any](/*24.5*/if(gestores.size == 0)/*24.27*/ {_display_(Seq[Any](format.raw/*24.29*/("""
				<h3>Nenhum Gestor cadastrado.</h3>			
			""")))}/*26.6*/else/*26.11*/{_display_(Seq[Any](format.raw/*26.12*/("""
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
                	"""),_display_(Seq[Any](/*38.19*/for(gestor <- gestores) yield /*38.42*/ {_display_(Seq[Any](format.raw/*38.44*/("""
	                <tr>
                		<td>"""),_display_(Seq[Any](/*40.24*/gestor/*40.30*/.nome)),format.raw/*40.35*/("""</td>
                		<td>"""),_display_(Seq[Any](/*41.24*/gestor/*41.30*/.email)),format.raw/*41.36*/("""</td>
                		<td>"""),_display_(Seq[Any](/*42.24*/gestor/*42.30*/.login)),format.raw/*42.36*/("""</td>
                		<td>"""),_display_(Seq[Any](/*43.24*/gestor/*43.30*/.campus.getNome)),format.raw/*43.45*/("""</td>
						<td style="width:15%;">
							<a href=""""),_display_(Seq[Any](/*45.18*/routes/*45.24*/.Gestores.formularioEdicao(gestor.id))),format.raw/*45.61*/("""" class="btn btn-small"><i class="icon-edit"></i> Editar</a>
							<a href=""""),_display_(Seq[Any](/*46.18*/routes/*46.24*/.Gestores.deletar(gestor.id))),format.raw/*46.52*/("""" onclick="return confirm('Deseja realmente excluir o gestor &quot;"""),_display_(Seq[Any](/*46.120*/gestor/*46.126*/.nome)),format.raw/*46.131*/("""&quot;?')" class="btn btn-small"><i class="icon-remove"></i> Excluir</a>
						</td>
	                </tr>
					""")))})),format.raw/*49.7*/("""
	              </tbody>
	            </table>
			""")))})),format.raw/*52.5*/("""
		</div>
	</div>	
	

""")))})))}
    }
    
    def render(gestores:List[Usuario]) = apply(gestores)
    
    def f:((List[Usuario]) => play.api.templates.Html) = (gestores) => apply(gestores)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jan 05 16:47:09 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/Gestor/listaGestores.scala.html
                    HASH: 14cb75e263bb7dbc2a45354262066e04429fb1fd
                    MATRIX: 777->1|966->26|996->118|1035->123|1046->127|1084->129|1363->372|1378->378|1420->398|1564->507|1595->529|1635->531|1702->581|1715->586|1754->587|2177->974|2216->997|2256->999|2340->1047|2355->1053|2382->1058|2448->1088|2463->1094|2491->1100|2557->1130|2572->1136|2600->1142|2666->1172|2681->1178|2718->1193|2809->1248|2824->1254|2883->1291|2998->1370|3013->1376|3063->1404|3168->1472|3184->1478|3212->1483|3360->1600|3445->1654
                    LINES: 27->1|35->1|37->6|39->8|39->8|39->8|49->18|49->18|49->18|55->24|55->24|55->24|57->26|57->26|57->26|69->38|69->38|69->38|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|76->45|76->45|76->45|77->46|77->46|77->46|77->46|77->46|77->46|80->49|83->52
                    -- GENERATED --
                */
            