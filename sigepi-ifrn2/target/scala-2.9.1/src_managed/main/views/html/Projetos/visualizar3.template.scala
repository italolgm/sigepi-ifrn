
package views.html.Projetos

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
object visualizar3 extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[ProjetoAvaliado],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(meuProjeto: List[ProjetoAvaliado]):play.api.templates.Html = {
        _display_ {import tags._

import helper._

import helpers.Seguranca.InformacoesUsuarioHelper._


Seq[Any](format.raw/*1.37*/("""


"""),format.raw/*7.1*/("""
"""),_display_(Seq[Any](/*8.2*/main/*8.6*/ {_display_(Seq[Any](format.raw/*8.8*/("""
	<div class="row">
		<div class="span12">
			<div class="page-header" style="overflow:hidden;">
				<h1 style="float:left;"> Projetos que eu ja avalei </h1>
			</div>
			
			 """),_display_(Seq[Any](/*15.6*/if(meuProjeto.size == 0)/*15.30*/ {_display_(Seq[Any](format.raw/*15.32*/("""
				<h3>Nenhum projeto avaliado.</h3>			
			""")))}/*17.6*/else/*17.11*/{_display_(Seq[Any](format.raw/*17.12*/("""
			<table class="table table-bordered table-hover">
              <thead>
                <tr>
                  <th>Edital</th>
                  <th>Projeto</th>
                  <th>Pontuação dada</th>
                </tr>
              </thead>
              <tbody>
              
            
              
               	"""),_display_(Seq[Any](/*30.18*/for(projetoAvaliado <- meuProjeto) yield /*30.52*/ {_display_(Seq[Any](format.raw/*30.54*/("""
                <tr>
               		<td style="width:30%;">
               			"""),_display_(Seq[Any](/*33.20*/projetoAvaliado/*33.35*/.projeto.getEdital.getTitulo)),format.raw/*33.63*/("""
               		</td>
               		<td>"""),_display_(Seq[Any](/*35.23*/projetoAvaliado/*35.38*/.projeto.getTitulo)),format.raw/*35.56*/("""</td>
               	"""),format.raw/*36.100*/("""
                """),format.raw/*37.73*/("""
               	    <td style="width:15%;">"""),_display_(Seq[Any](/*38.45*/projetoAvaliado/*38.60*/.pontuacaoObtida)),format.raw/*38.76*/(""" Pontos</td> 
                </tr>
				""")))})),format.raw/*40.6*/("""
			""")))})),format.raw/*41.5*/("""
              </tbody>
            </table>
		</div>
	</div>	
""")))})))}
    }
    
    def render(meuProjeto:List[ProjetoAvaliado]) = apply(meuProjeto)
    
    def f:((List[ProjetoAvaliado]) => play.api.templates.Html) = (meuProjeto) => apply(meuProjeto)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jan 05 16:47:09 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/Projetos/visualizar3.scala.html
                    HASH: 0fa7363957b2f96842fb4ee8f0fd0296f5f061ba
                    MATRIX: 785->1|984->36|1016->130|1053->133|1064->137|1102->139|1321->323|1354->347|1394->349|1460->398|1473->403|1512->404|1895->751|1945->785|1985->787|2106->872|2130->887|2180->915|2264->963|2288->978|2328->996|2380->1102|2426->1176|2508->1222|2532->1237|2570->1253|2644->1296|2681->1302
                    LINES: 27->1|35->1|38->7|39->8|39->8|39->8|46->15|46->15|46->15|48->17|48->17|48->17|61->30|61->30|61->30|64->33|64->33|64->33|66->35|66->35|66->35|67->36|68->37|69->38|69->38|69->38|71->40|72->41
                    -- GENERATED --
                */
            