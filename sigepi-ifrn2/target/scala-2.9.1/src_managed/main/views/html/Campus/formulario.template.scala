
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
object formulario extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Campus],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(formulario: Form[Campus]):play.api.templates.Html = {
        _display_ {import tags._

import helper._

import helper.twitterBootstrap._

import helpers.Seguranca.InformacoesUsuarioHelper._

import helper.{FieldConstructor}


Seq[Any](format.raw/*1.28*/("""

"""),format.raw/*8.1*/("""

"""),_display_(Seq[Any](/*10.2*/main/*10.6*/ {_display_(Seq[Any](format.raw/*10.8*/("""

<div class="row">
		<div class="span12">
			<div class="page-header">
				<h1>Cadastro de Campus</h1>
			</div>
			
			"""),_display_(Seq[Any](/*18.5*/helper/*18.11*/.form(action = routes.CampusController.cadastrar(), 'style -> "margin:0;")/*18.85*/{_display_(Seq[Any](format.raw/*18.86*/("""
				"""),_display_(Seq[Any](/*19.6*/helper/*19.12*/.inputText(formulario("nome"), 'id -> "nome", 'class -> "span6", '_label -> "Nome do Campus: ", '_showConstraints -> false, '_showErrors -> true))),format.raw/*19.157*/("""
				
				<button type="submit" class="btn btn-primary">Cadastrar Campus</button>
				&nbsp;
				<a class="btn" href=""""),_display_(Seq[Any](/*23.27*/routes/*23.33*/.CampusController.index)),format.raw/*23.56*/("""" >Cancelar</a>
			""")))})),format.raw/*24.5*/("""
			
		</div>
	</div>

""")))})))}
    }
    
    def render(formulario:Form[Campus]) = apply(formulario)
    
    def f:((Form[Campus]) => play.api.templates.Html) = (formulario) => apply(formulario)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jan 06 20:24:25 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/Campus/formulario.scala.html
                    HASH: 759b34e9f59a79e7e4d2d3c60a2ab329e2729bbc
                    MATRIX: 773->1|1033->27|1063->189|1103->194|1115->198|1154->200|1319->330|1334->336|1417->410|1456->411|1498->418|1513->424|1681->569|1840->692|1855->698|1900->721|1952->742
                    LINES: 27->1|39->1|41->8|43->10|43->10|43->10|51->18|51->18|51->18|51->18|52->19|52->19|52->19|56->23|56->23|56->23|57->24
                    -- GENERATED --
                */
            