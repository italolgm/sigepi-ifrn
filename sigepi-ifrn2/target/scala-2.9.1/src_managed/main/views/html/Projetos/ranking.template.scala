
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
object ranking extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[TreeMap[Projeto, Integer],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(rankingProjetos: TreeMap[Projeto,Integer]):play.api.templates.Html = {
        _display_ {import tags._

import helper._

import helpers.Seguranca.InformacoesUsuarioHelper._


Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*6.1*/("""
"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""

<div class="row">
		<div class="span12">
			<div class="page-header" style="overflow:hidden;">
				<h1 style="float:left;">Ranking dos Projetos</h1>
			</div>
			
			<table class="table table-bordered table-hover">
              <thead>
                <tr>
           
                  <th>Edital</th> 
                  <th>Colocação</th>
                  <th>Nome</th>
                 
                  <th>Pontuação Total</th>
                </tr>
              </thead>
              <tbody>
               	"""),_display_(Seq[Any](/*27.18*/for((ranking, i) <- rankingProjetos.view.zipWithIndex) yield /*27.72*/ {_display_(Seq[Any](format.raw/*27.74*/("""
               	
                     
                <tr>
                       
                 """),_display_(Seq[Any](/*32.19*/if(isCampusIgual(ranking._1.id))/*32.51*/{_display_(Seq[Any](format.raw/*32.52*/(""" 
               	
	               
	               		<td style="width:15%;">"""),_display_(Seq[Any](/*35.43*/ranking/*35.50*/._1.edital.getTitulo)),format.raw/*35.70*/(""" </td> 
	               		<td style="width:5%;">
	               			"""),_display_(Seq[Any](/*37.21*/{var colocacao = i + 1; colocacao})),format.raw/*37.55*/("""º
	               		</td>
	               		<td>"""),_display_(Seq[Any](/*39.24*/ranking/*39.31*/._1.titulo)),format.raw/*39.41*/("""</td>
	               		
	               		<td style="width:15%;">"""),_display_(Seq[Any](/*41.43*/ranking/*41.50*/._2)),format.raw/*41.53*/(""" ponto(s)</td>
	                
                 """)))})),format.raw/*43.19*/("""
                 </tr>
				""")))})),format.raw/*45.6*/("""
              </tbody>
            </table>
		</div>
	</div>	

""")))})))}
    }
    
    def render(rankingProjetos:TreeMap[Projeto, Integer]) = apply(rankingProjetos)
    
    def f:((TreeMap[Projeto, Integer]) => play.api.templates.Html) = (rankingProjetos) => apply(rankingProjetos)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jan 05 16:47:09 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/Projetos/ranking.scala.html
                    HASH: 7603f2331d5302959418a2ae18739ab3ba90e7ed
                    MATRIX: 785->1|992->44|1022->136|1059->139|1070->143|1108->145|1685->686|1755->740|1795->742|1939->850|1980->882|2019->883|2136->964|2152->971|2194->991|2301->1062|2357->1096|2444->1147|2460->1154|2492->1164|2597->1233|2613->1240|2638->1243|2723->1296|2785->1327
                    LINES: 27->1|35->1|37->6|38->7|38->7|38->7|58->27|58->27|58->27|63->32|63->32|63->32|66->35|66->35|66->35|68->37|68->37|70->39|70->39|70->39|72->41|72->41|72->41|74->43|76->45
                    -- GENERATED --
                */
            