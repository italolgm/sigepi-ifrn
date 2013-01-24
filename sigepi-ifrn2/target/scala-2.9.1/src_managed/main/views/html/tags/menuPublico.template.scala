
package views.html.tags

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
object menuPublico extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<div class="navbar navbar-fixed-top">
	<div class="navbar-inner">
		<div class="container">
			<a data-target=".nav-collapse" data-toggle="collapse"
				class="btn btn-navbar"> <span class="icon-bar"></span> <span
				class="icon-bar"></span> <span class="icon-bar"></span>
			</a> 
			<div class="nav-collapse">
				<ul class="nav">
				<li><a href=""""),_display_(Seq[Any](/*10.19*/routes/*10.25*/.Application.index)),format.raw/*10.43*/("""" style="font-size: 28px;">SIGEPI</a></li>
					<li class="dropdown"><a data-toggle="dropdown"
						class="dropdown-toggle" href="#">Sobre <b class="caret"></b></a>
						"""),format.raw/*20.9*/("""
					</li>
					<li><a href="routes.Application.contato">Contato</a></li>
				</ul>
				<ul class="nav pull-right">
				<li> <a>Natal,	"""),_display_(Seq[Any](/*25.21*/{new java.util.Date().format("dd")})),format.raw/*25.56*/(""" de 
				
							  """),_display_(Seq[Any](/*27.11*/if( new java.util.Date().format("MM").toString == "01")/*27.66*/{_display_(Seq[Any](format.raw/*27.67*/("""
							        
							        Janeiro 
							    
							   """)))})),format.raw/*31.12*/(""" 
							    """),_display_(Seq[Any](/*32.13*/if( new java.util.Date().format("MM").toString == "02")/*32.68*/{_display_(Seq[Any](format.raw/*32.69*/("""
							        
							         Fevereiro
							  
							   """)))})),format.raw/*36.12*/("""
							    """),_display_(Seq[Any](/*37.13*/if( new java.util.Date().format("MM").toString == "03")/*37.68*/{_display_(Seq[Any](format.raw/*37.69*/("""
							        
							         Mar�o
							  
							   """)))})),format.raw/*41.12*/("""
							    """),_display_(Seq[Any](/*42.13*/if( new java.util.Date().format("MM").toString == "04")/*42.68*/{_display_(Seq[Any](format.raw/*42.69*/("""
							        
							         Abril
							  
							   """)))})),format.raw/*46.12*/("""
							    """),_display_(Seq[Any](/*47.13*/if( new java.util.Date().format("MM").toString == "05")/*47.68*/{_display_(Seq[Any](format.raw/*47.69*/("""
							        
							         Maio
							  
							   """)))})),format.raw/*51.12*/("""
							    """),_display_(Seq[Any](/*52.13*/if( new java.util.Date().format("MM").toString == "06")/*52.68*/{_display_(Seq[Any](format.raw/*52.69*/("""
							        
							         Junho
							  
							   """)))})),format.raw/*56.12*/("""
							    """),_display_(Seq[Any](/*57.13*/if( new java.util.Date().format("MM").toString == "07")/*57.68*/{_display_(Seq[Any](format.raw/*57.69*/("""
							        
							         Julho
							  
							   """)))})),format.raw/*61.12*/("""
							    """),_display_(Seq[Any](/*62.13*/if( new java.util.Date().format("MM").toString == "08")/*62.68*/{_display_(Seq[Any](format.raw/*62.69*/("""
							        
							         Agosto
							  
							   """)))})),format.raw/*66.12*/("""
							    """),_display_(Seq[Any](/*67.13*/if( new java.util.Date().format("MM").toString == "09")/*67.68*/{_display_(Seq[Any](format.raw/*67.69*/("""
							        
							         Setembro
							  
							   """)))})),format.raw/*71.12*/("""
							    """),_display_(Seq[Any](/*72.13*/if( new java.util.Date().format("MM").toString == "10")/*72.68*/{_display_(Seq[Any](format.raw/*72.69*/("""
							        
							         Outubro
							  
							   """)))})),format.raw/*76.12*/("""
							    """),_display_(Seq[Any](/*77.13*/if( new java.util.Date().format("MM").toString == "11")/*77.68*/{_display_(Seq[Any](format.raw/*77.69*/("""
							        
							         Novembro
							  
							   """)))})),format.raw/*81.12*/("""
							    """),_display_(Seq[Any](/*82.13*/if( new java.util.Date().format("MM").toString == "12")/*82.68*/{_display_(Seq[Any](format.raw/*82.69*/("""
							        
							         Dezembro
							  
							   """)))})),format.raw/*86.12*/("""
			             de """),_display_(Seq[Any](/*87.21*/{new java.util.Date().format("yyyy")})),format.raw/*87.58*/("""
				     </a>
				</li>
					<li class="divider-vertical"></li>
					<li><a href=""""),_display_(Seq[Any](/*91.20*/routes/*91.26*/.Sessions.login)),format.raw/*91.41*/("""">Entrar no Sistema</a></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>
</div>"""))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jan 06 20:47:08 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/tags/menuPublico.scala.html
                    HASH: ddbd68fc66ac572a908cadad9e5d76e1b502545f
                    MATRIX: 830->0|1227->361|1242->367|1282->385|1484->886|1662->1028|1719->1063|1777->1085|1841->1140|1880->1141|1980->1209|2031->1224|2095->1279|2134->1280|2234->1348|2284->1362|2348->1417|2387->1418|2483->1482|2533->1496|2597->1551|2636->1552|2732->1616|2782->1630|2846->1685|2885->1686|2980->1749|3030->1763|3094->1818|3133->1819|3229->1883|3279->1897|3343->1952|3382->1953|3478->2017|3528->2031|3592->2086|3631->2087|3728->2152|3778->2166|3842->2221|3881->2222|3980->2289|4030->2303|4094->2358|4133->2359|4231->2425|4281->2439|4345->2494|4384->2495|4483->2562|4533->2576|4597->2631|4636->2632|4735->2699|4793->2721|4852->2758|4976->2846|4991->2852|5028->2867
                    LINES: 30->1|39->10|39->10|39->10|42->20|47->25|47->25|49->27|49->27|49->27|53->31|54->32|54->32|54->32|58->36|59->37|59->37|59->37|63->41|64->42|64->42|64->42|68->46|69->47|69->47|69->47|73->51|74->52|74->52|74->52|78->56|79->57|79->57|79->57|83->61|84->62|84->62|84->62|88->66|89->67|89->67|89->67|93->71|94->72|94->72|94->72|98->76|99->77|99->77|99->77|103->81|104->82|104->82|104->82|108->86|109->87|109->87|113->91|113->91|113->91
                    -- GENERATED --
                */
            