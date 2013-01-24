
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
object visualizar extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Campus,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(campus: Campus):play.api.templates.Html = {
        _display_ {import tags._

import helper._

import helpers.Seguranca.InformacoesUsuarioHelper._


Seq[Any](format.raw/*1.18*/("""

"""),format.raw/*6.1*/("""

"""),_display_(Seq[Any](/*8.2*/main/*8.6*/ {_display_(Seq[Any](format.raw/*8.8*/("""


<div class="row">
		<div class="span12">
			<div class="page-header" style="overflow:hidden;">
				<h1 style="float:left;">
					
					"""),_display_(Seq[Any](/*16.7*/campus/*16.13*/.nome)),format.raw/*16.18*/("""<br/>
					
				</h1>
				
				
			</div>
			<a class="btn" href=""""),_display_(Seq[Any](/*22.26*/routes/*22.32*/.CampusController.index)),format.raw/*22.55*/("""" >Voltar</a>
		</div>
</div>	

""")))})))}
    }
    
    def render(campus:Campus) = apply(campus)
    
    def f:((Campus) => play.api.templates.Html) = (campus) => apply(campus)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jan 05 16:47:08 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/Campus/visualizar.scala.html
                    HASH: c8936175c0d37819bc5cf48065a987a0462af8cb
                    MATRIX: 767->1|947->17|977->109|1016->114|1027->118|1065->120|1247->267|1262->273|1289->278|1398->351|1413->357|1458->380
                    LINES: 27->1|35->1|37->6|39->8|39->8|39->8|47->16|47->16|47->16|53->22|53->22|53->22
                    -- GENERATED --
                */
            