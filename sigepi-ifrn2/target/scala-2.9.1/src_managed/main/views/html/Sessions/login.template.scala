
package views.html.Sessions

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
object login extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[forms.LoginForm],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(loginForm: Form[forms.LoginForm]):play.api.templates.Html = {
        _display_ {import tags._

import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.36*/("""

"""),format.raw/*6.1*/("""
"""),_display_(Seq[Any](/*7.2*/main/*7.6*/  {_display_(Seq[Any](format.raw/*7.9*/("""
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>

<h1> SIGEPI entrar</h1> 
<div class="well" style="width:280px; margin:0 auto;">
   		"""),_display_(Seq[Any](/*15.7*/helper/*15.13*/.form(action = routes.Sessions.efetuarLogin(), 'style -> "margin:0;")/*15.82*/ {_display_(Seq[Any](format.raw/*15.84*/("""
   			<fieldset>
   				<legend>Entrar no sistema</legend>
   				
   				"""),_display_(Seq[Any](/*19.9*/helper/*19.15*/.inputText(loginForm("login"), 'class -> "span3", '_label -> "Login: "))),format.raw/*19.86*/("""
   				"""),_display_(Seq[Any](/*20.9*/helper/*20.15*/.inputPassword(loginForm("senha"), 'class -> "span3", '_label -> "Senha: "))),format.raw/*20.90*/("""
   				<center>
   				   <input type="submit" value="      Entrar!      " class="btn btn-primary">
   			    </center> 
   			</fieldset>
   		""")))})),format.raw/*25.7*/(""" 
  	</div> 
  	
  	<br><br> 	
  	
  	<center>  	
  	<div class="well" style="width:450px;">
       
        <a href=""""),_display_(Seq[Any](/*33.19*/routes/*33.25*/.Professores.formulario)),format.raw/*33.48*/("""" class="btn">Professor - Faça seu Registro</a>	
        <a href=""""),_display_(Seq[Any](/*34.19*/routes/*34.25*/.Gestores.formulario)),format.raw/*34.45*/("""" class="btn">Gestor - Faça seu Registro</a>	
  
    </div>
   </center>

</html> 
""")))})),format.raw/*40.2*/("""


<script type="text/javascript">
	$(document).ready(function()"""),format.raw("""{"""),format.raw/*44.31*/("""
		$(".navbar .nav:nth-child(2) > li:nth-child(3)").addClass("active");
	"""),format.raw("""}"""),format.raw/*46.3*/(""");
</script>"""))}
    }
    
    def render(loginForm:Form[forms.LoginForm]) = apply(loginForm)
    
    def f:((Form[forms.LoginForm]) => play.api.templates.Html) = (loginForm) => apply(loginForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jan 05 16:56:03 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/Sessions/login.scala.html
                    HASH: f57fd66eb626461befb68b6831e3d6e29ecd2b83
                    MATRIX: 779->1|958->35|988->108|1025->111|1036->115|1075->118|1298->306|1313->312|1391->381|1431->383|1546->463|1561->469|1654->540|1699->550|1714->556|1811->631|1993->782|2156->909|2171->915|2216->938|2320->1006|2335->1012|2377->1032|2498->1122|2614->1191|2736->1267
                    LINES: 27->1|35->1|37->6|38->7|38->7|38->7|46->15|46->15|46->15|46->15|50->19|50->19|50->19|51->20|51->20|51->20|56->25|64->33|64->33|64->33|65->34|65->34|65->34|71->40|75->44|77->46
                    -- GENERATED --
                */
            