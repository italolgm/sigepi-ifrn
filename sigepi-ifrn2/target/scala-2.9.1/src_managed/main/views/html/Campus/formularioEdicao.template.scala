
package views.html.Campus

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
object formularioEdicao extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Campus],Campus,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(formulario: Form[Campus], campus: Campus):play.api.templates.Html = {
        _display_ {import tags._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.44*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main/*6.6*/ {_display_(Seq[Any](format.raw/*6.8*/("""

<div class="row">
		<div class="span12">
			<div class="page-header">
				<h1>Edição do Campus: """),_display_(Seq[Any](/*11.28*/campus/*11.34*/.nome)),format.raw/*11.39*/("""</h1>
			</div>
			
			"""),_display_(Seq[Any](/*14.5*/helper/*14.11*/.form(action = routes.CampusController.editar(campus.id), 'style -> "margin:0;", 'class -> "form-horizontal")/*14.120*/{_display_(Seq[Any](format.raw/*14.121*/("""
			
				"""),_display_(Seq[Any](/*16.6*/helper/*16.12*/.inputText(formulario("nome"), 'id -> "nome",'class -> "span6", '_label -> "Nome do Campus: ", '_showConstraints -> false, '_showErrors -> true))),format.raw/*16.156*/("""
				
				<button type="submit" class="btn btn-primary">Editar o campus</button>
				&nbsp;
				<a class="btn" href=""""),_display_(Seq[Any](/*20.27*/routes/*20.33*/.CampusController.index)),format.raw/*20.56*/("""" >Cancelar</a>
			""")))})),format.raw/*21.5*/("""
			
		</div>
	</div>	

""")))})))}
    }
    
    def render(formulario:Form[Campus],campus:Campus) = apply(formulario,campus)
    
    def f:((Form[Campus],Campus) => play.api.templates.Html) = (formulario,campus) => apply(formulario,campus)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jan 06 20:24:51 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/Campus/formularioEdicao.scala.html
                    HASH: 6626e5532dee830cf30b39bcfd9377bd2b54a10b
                    MATRIX: 786->1|955->43|985->98|1022->101|1033->105|1071->107|1211->211|1226->217|1253->222|1315->249|1330->255|1449->364|1489->365|1536->377|1551->383|1718->527|1876->649|1891->655|1936->678|1988->699
                    LINES: 27->1|33->1|35->5|36->6|36->6|36->6|41->11|41->11|41->11|44->14|44->14|44->14|44->14|46->16|46->16|46->16|50->20|50->20|50->20|51->21
                    -- GENERATED --
                */
            