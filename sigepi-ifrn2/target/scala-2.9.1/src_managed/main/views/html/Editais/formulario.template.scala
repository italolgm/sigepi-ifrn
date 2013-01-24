
package views.html.Editais

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
object formulario extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Edital],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(formulario: Form[Edital]):play.api.templates.Html = {
        _display_ {import tags._

import helper.twitterBootstrap._

import helper._

import helpers.Seguranca.InformacoesUsuarioHelper._

import helper.{FieldConstructor}


Seq[Any](format.raw/*1.28*/("""

"""),format.raw/*8.1*/("""


"""),_display_(Seq[Any](/*11.2*/main/*11.6*/ {_display_(Seq[Any](format.raw/*11.8*/("""

<div class="row">
		<div class="span12">
			<div class="page-header">
				<h1>Cadastro de Edital</h1>
			</div>
			
			"""),_display_(Seq[Any](/*19.5*/helper/*19.11*/.form(action = routes.Editais.cadastrar(), 'style -> "margin:0;")/*19.76*/{_display_(Seq[Any](format.raw/*19.77*/("""
				"""),_display_(Seq[Any](/*20.6*/helper/*20.12*/.inputText(formulario("titulo"), 'id -> "titulo", 'class -> "span6", '_label -> "Título do Edital: ", '_showConstraints -> false, '_showErrors -> true))),format.raw/*20.163*/("""
				
				<button type="submit" class="btn btn-primary">Cadastrar Edital</button>
				&nbsp;
				<a class="btn" href=""""),_display_(Seq[Any](/*24.27*/routes/*24.33*/.Editais.index)),format.raw/*24.47*/("""" >Cancelar</a>
			""")))})),format.raw/*25.5*/("""
			
		</div>
	</div>


""")))})),format.raw/*31.2*/("""

<script type="text/javascript">
$(document).ready(function()"""),format.raw("""{"""),format.raw/*34.30*/("""
	$(".navbar .nav:nth-child(1) > li:nth-child(2)").addClass("active");
"""),format.raw("""}"""),format.raw/*36.2*/(""");
</script>"""))}
    }
    
    def render(formulario:Form[Edital]) = apply(formulario)
    
    def f:((Form[Edital]) => play.api.templates.Html) = (formulario) => apply(formulario)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jan 06 20:11:38 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/Editais/formulario.scala.html
                    HASH: 060fdd0bb220c6a359ce488b7445343dbb2a9cb7
                    MATRIX: 774->1|1034->27|1064->189|1106->196|1118->200|1157->202|1322->332|1337->338|1411->403|1450->404|1492->411|1507->417|1681->568|1840->691|1855->697|1891->711|1943->732|2005->763|2118->829|2238->903
                    LINES: 27->1|39->1|41->8|44->11|44->11|44->11|52->19|52->19|52->19|52->19|53->20|53->20|53->20|57->24|57->24|57->24|58->25|64->31|67->34|69->36
                    -- GENERATED --
                */
            