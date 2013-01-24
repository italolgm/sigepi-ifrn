
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
object formularioEdicao extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Edital],Edital,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(formulario: Form[Edital], edital: Edital):play.api.templates.Html = {
        _display_ {import tags._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.44*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main/*6.6*/ {_display_(Seq[Any](format.raw/*6.8*/("""

<div class="row">
		<div class="span12">
			<div class="page-header">
				<h1>Edição do Edital: """),_display_(Seq[Any](/*11.28*/edital/*11.34*/.titulo)),format.raw/*11.41*/("""</h1>
			</div>
			
			"""),_display_(Seq[Any](/*14.5*/helper/*14.11*/.form(action = routes.Editais.editar(edital.id), 'style -> "margin:0;", 'class -> "form-horizontal")/*14.111*/{_display_(Seq[Any](format.raw/*14.112*/("""
			
				"""),_display_(Seq[Any](/*16.6*/helper/*16.12*/.inputText(formulario("titulo"), 'id -> "titulo",'class -> "span6", '_label -> "Título do Edital: ", '_showConstraints -> false, '_showErrors -> true))),format.raw/*16.162*/("""
				
				<button type="submit" class="btn btn-primary">Editar o edital</button>
				&nbsp;
				<a class="btn" href=""""),_display_(Seq[Any](/*20.27*/routes/*20.33*/.Editais.index)),format.raw/*20.47*/("""" >Cancelar</a>
			""")))})),format.raw/*21.5*/("""
			
		</div>
	</div>	
""")))})))}
    }
    
    def render(formulario:Form[Edital],edital:Edital) = apply(formulario,edital)
    
    def f:((Form[Edital],Edital) => play.api.templates.Html) = (formulario,edital) => apply(formulario,edital)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jan 05 16:47:08 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/Editais/formularioEdicao.scala.html
                    HASH: 001efe41e728f1d6b487cc2e0af307b69e92cc8b
                    MATRIX: 787->1|956->43|986->98|1023->101|1034->105|1072->107|1212->211|1227->217|1256->224|1318->251|1333->257|1443->357|1483->358|1530->370|1545->376|1718->526|1876->648|1891->654|1927->668|1979->689
                    LINES: 27->1|33->1|35->5|36->6|36->6|36->6|41->11|41->11|41->11|44->14|44->14|44->14|44->14|46->16|46->16|46->16|50->20|50->20|50->20|51->21
                    -- GENERATED --
                */
            