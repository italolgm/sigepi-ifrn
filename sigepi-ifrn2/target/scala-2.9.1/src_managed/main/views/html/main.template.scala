
package views.html

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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(content: Html):play.api.templates.Html = {
        _display_ {import tags._

import forms.LoginForm._

import helper._

import helpers.Seguranca.InformacoesUsuarioHelper._


Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*7.1*/("""
 
<!DOCTYPE html> 

<html>
    <head>
        <title>SIGEPI - Sistema de Gestão de Pesquisa e Inovação</title>
        
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        
        <!-- Estilos do Twitter Boostrap -->
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*18.54*/routes/*18.60*/.Assets.at("bootstrap/css/bootstrap.min.css"))),format.raw/*18.105*/("""">
        <style type="text/css">
	      body """),format.raw("""{"""),format.raw/*20.14*/("""
	        padding-top: 80px;
	        padding-bottom: 40px;
	      """),format.raw("""}"""),format.raw/*23.9*/("""
	    </style>
		<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*25.48*/routes/*25.54*/.Assets.at("bootstrap/css/bootstrap-responsive.min.css"))),format.raw/*25.110*/("""">
		    
        <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
	    <!--[if lt IE 9]>
	      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	    <![endif]-->
	    
        <!-- Estilos da AplicaÃ§Ã£o -->
        
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*34.54*/routes/*34.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*34.99*/("""">  
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*35.54*/routes/*35.60*/.Assets.at("stylesheets/main.css"))),format.raw/*35.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*36.59*/routes/*36.65*/.Assets.at("images/favicon.png"))),format.raw/*36.97*/("""">
        
        <script src=""""),_display_(Seq[Any](/*38.23*/routes/*38.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*38.74*/("""" type="text/javascript"></script>
		<script src=""""),_display_(Seq[Any](/*39.17*/routes/*39.23*/.Assets.at("bootstrap/js/bootstrap.min.js"))),format.raw/*39.66*/("""" type="text/javascript"></script>
		
        <script src=""""),_display_(Seq[Any](/*41.23*/routes/*41.29*/.Assets.at("bootstrap/js/bootstrap-collapse.js"))),format.raw/*41.77*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*42.23*/routes/*42.29*/.Assets.at("bootstrap/js/bootstrap-alert.js"))),format.raw/*42.74*/("""" type="text/javascript"></script>
        
        <script src=""""),_display_(Seq[Any](/*44.23*/routes/*44.29*/.Assets.at("javascripts/main.js"))),format.raw/*44.62*/("""" type="text/javascript"></script>
    </head>
    <body>
    
    """),format.raw/*70.6*/("""
   
   """),_display_(Seq[Any](/*72.5*/if(isLogado())/*72.19*/ {_display_(Seq[Any](format.raw/*72.21*/("""
	
		"""),_display_(Seq[Any](/*74.4*/if(getUsuarioLogado().isProfessor)/*74.38*/ {_display_(Seq[Any](format.raw/*74.40*/("""
			"""),_display_(Seq[Any](/*75.5*/menuProfessor())),format.raw/*75.20*/("""
   	    """)))})),format.raw/*76.10*/("""
   	    
   	    """),_display_(Seq[Any](/*78.10*/if(getUsuarioLogado().isAdministrador)/*78.48*/ {_display_(Seq[Any](format.raw/*78.50*/("""
			"""),_display_(Seq[Any](/*79.5*/menuAdmin())),format.raw/*79.16*/("""
   	    """)))})),format.raw/*80.10*/("""
   	    
   	    """),_display_(Seq[Any](/*82.10*/if(getUsuarioLogado().isAvaliador)/*82.44*/	{_display_(Seq[Any](format.raw/*82.46*/("""
   	    	"""),_display_(Seq[Any](/*83.11*/menuAvaliador())),format.raw/*83.26*/(""" 	
   	    """)))})),format.raw/*84.10*/("""
   	    
   	    """),_display_(Seq[Any](/*86.10*/if(getUsuarioLogado().isGestor)/*86.41*/{_display_(Seq[Any](format.raw/*86.42*/("""
   	        """),_display_(Seq[Any](/*87.14*/menuGestor())),format.raw/*87.26*/("""
   	    """)))})),format.raw/*88.10*/("""
    	
    """)))}/*90.7*/else/*90.12*/{_display_(Seq[Any](format.raw/*90.13*/("""
    		"""),_display_(Seq[Any](/*91.8*/menuPublico())),format.raw/*91.21*/("""
    """)))})),format.raw/*92.6*/("""


	<div class="container">

          <div class="content">
                
                <div class="page-header">
                  """),format.raw/*100.41*/("""
        
				        """),_display_(Seq[Any](/*102.14*/if(flash.containsKey("success"))/*102.46*/{_display_(Seq[Any](format.raw/*102.47*/("""
				        <br>
						   <center><h3><div class="success">"""),_display_(Seq[Any](/*104.44*/flash/*104.49*/.get("success"))),format.raw/*104.64*/("""</div></h3></center>  
						   <br>
					    """)))})),format.raw/*106.11*/(""" """),_display_(Seq[Any](/*106.13*/if(flash.containsKey("error"))/*106.43*/{_display_(Seq[Any](format.raw/*106.44*/("""
					    <br>
						   <center><h3><div class="error">"""),_display_(Seq[Any](/*108.42*/flash/*108.47*/.get("error"))),format.raw/*108.60*/("""</div></h3></center> 
						   <br>
					    """)))})),format.raw/*110.11*/("""
                </div>

                <div class="row">
                        """),_display_(Seq[Any](/*114.26*/content)),format.raw/*114.33*/("""
                </div>
                
          </div>
<hr />
            <footer>
                
        	
        		<br/>
			<center>
				<p>	SIGEPI - Sistema de Gestão de Pesquisa e Inovação - versão 1.2-alpha <br />
					<a href="http://portal.ifrn.edu.br/pesquisa/pro-reitoria-de-pesquisa-e-inovacao" target="blank" >PROPI - Pró-reitoria de Pesquisa e Inovação</a><br>
					<a href="http://ifrn.edu.br" target="blank">Instituto Federal de Educação,	Ciência e Tecnologia do Rio Grande do Norte</a> <br /> </br>
				</p>
				</p>
			</center>
		</footer>

        </div>
    </body>
</html>
"""))}
    }
    
    def render(content:Html) = apply(content)
    
    def f:((Html) => play.api.templates.Html) = (content) => apply(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jan 05 22:04:35 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/main.scala.html
                    HASH: 57f0809c169d00f20ed4847701269f715973c6c7
                    MATRIX: 752->1|954->16|982->129|1322->433|1337->439|1405->484|1500->532|1614->600|1712->662|1727->668|1806->724|2151->1033|2166->1039|2227->1078|2321->1136|2336->1142|2392->1176|2489->1237|2504->1243|2558->1275|2628->1309|2643->1315|2710->1360|2797->1411|2812->1417|2877->1460|2973->1520|2988->1526|3058->1574|3151->1631|3166->1637|3233->1682|3335->1748|3350->1754|3405->1787|3499->2222|3543->2231|3566->2245|3606->2247|3647->2253|3690->2287|3730->2289|3770->2294|3807->2309|3849->2319|3904->2338|3951->2376|3991->2378|4031->2383|4064->2394|4106->2404|4161->2423|4204->2457|4244->2459|4291->2470|4328->2485|4372->2497|4427->2516|4467->2547|4506->2548|4556->2562|4590->2574|4632->2584|4662->2597|4675->2602|4714->2603|4757->2611|4792->2624|4829->2630|4996->2790|5056->2813|5098->2845|5138->2846|5236->2907|5251->2912|5289->2927|5369->2974|5408->2976|5448->3006|5488->3007|5581->3063|5596->3068|5632->3081|5711->3127|5832->3211|5862->3218
                    LINES: 27->1|37->1|39->7|50->18|50->18|50->18|52->20|55->23|57->25|57->25|57->25|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|68->36|70->38|70->38|70->38|71->39|71->39|71->39|73->41|73->41|73->41|74->42|74->42|74->42|76->44|76->44|76->44|80->70|82->72|82->72|82->72|84->74|84->74|84->74|85->75|85->75|86->76|88->78|88->78|88->78|89->79|89->79|90->80|92->82|92->82|92->82|93->83|93->83|94->84|96->86|96->86|96->86|97->87|97->87|98->88|100->90|100->90|100->90|101->91|101->91|102->92|110->100|112->102|112->102|112->102|114->104|114->104|114->104|116->106|116->106|116->106|116->106|118->108|118->108|118->108|120->110|124->114|124->114
                    -- GENERATED --
                */
            