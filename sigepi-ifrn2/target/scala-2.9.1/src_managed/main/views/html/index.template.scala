
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.Html = {
        _display_ {import tags._

import helper._

import helpers.Seguranca.InformacoesUsuarioHelper._


Seq[Any](format.raw/*1.19*/("""

"""),format.raw/*6.1*/("""
"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
    
  """),format.raw/*9.50*/("""  
   
   
   <div class="row">
   
   <div class="span8">		
			
			
		<div style="text-align:center;">
				
				            <h2>SIGEPI - Sistema de Gestão de Pesquisa e Inovação</h2> <br />
				
				<div class="well" style="text-align:center; padding-top:10px;" >
						<img style="padding:15.5px 0;" src=""""),_display_(Seq[Any](/*22.44*/routes/*22.50*/.Assets.at("images/imagem01.jpg"))),format.raw/*22.83*/("""" />
				</div>
						
						<p>Facilitando a tarefa de cadastro de usuários, editais, submissão de projetos e avaliação dos projetos submetidos</p>
		</div>
		
		
   </div>
   
		<div class="span4" style="padding:50px 0 60px 0;">
		
			<h1 class="titulo" style="font-size:26px; margin-bottom:20px;">Pesquisa e Inovação do IFRN</h1>
			<h3 style="font-weight:normal;  margin-bottom:20px;">
				O SIGEPI é um sistema de informação para o gerenciamento de projetos de pesquisa da Pró-Reitoria de Pesquisa e Inovação do IFRN.				
			</h3>
			
			"""),_display_(Seq[Any](/*38.5*/if(!isLogado())/*38.20*/ {_display_(Seq[Any](format.raw/*38.22*/("""
				<center>
				   <a href=""""),_display_(Seq[Any](/*40.18*/routes/*40.24*/.Sessions.login)),format.raw/*40.39*/("""" class="btn-large btn-primary">Entrar no Sistema</a>
				</center>
			""")))})),format.raw/*42.5*/("""
		</div>
		
	</div>
	
	
	
    
""")))})))}
    }
    
    def render(message:String) = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jan 06 20:41:33 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/index.scala.html
                    HASH: e2fc745ddb0add7b96a0a584eb5778ae879202f0
                    MATRIX: 755->1|933->18|961->105|997->107|1008->111|1046->113|1081->168|1425->476|1440->482|1495->515|2074->1059|2098->1074|2138->1076|2205->1107|2220->1113|2257->1128|2360->1200
                    LINES: 27->1|35->1|37->6|38->7|38->7|38->7|40->9|53->22|53->22|53->22|69->38|69->38|69->38|71->40|71->40|71->40|73->42
                    -- GENERATED --
                */
            