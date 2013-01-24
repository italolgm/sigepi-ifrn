
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
object visualizar2 extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Projeto,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(projeto: Projeto):play.api.templates.Html = {
        _display_ {import tags._

import helper._

import helper.twitterBootstrap._

import helpers.Seguranca.InformacoesUsuarioHelper._


Seq[Any](format.raw/*1.20*/("""
"""),format.raw/*6.1*/("""

"""),_display_(Seq[Any](/*8.2*/main/*8.6*/ {_display_(Seq[Any](format.raw/*8.8*/("""

<div class="row">
		<div class="span12">
			<div class="page-header" style="overflow:hidden;">
				<h1 class="pull-left">
					"""),_display_(Seq[Any](/*14.7*/projeto/*14.14*/.titulo)),format.raw/*14.21*/("""
					<small> 
						- """),_display_(Seq[Any](/*16.10*/projeto/*16.17*/.edital.getTitulo)),format.raw/*16.34*/(""" <br/>
						Submetido por: """),_display_(Seq[Any](/*17.23*/projeto/*17.30*/.autor.getNome)),format.raw/*17.44*/("""
						
						<br/>
					"""),format.raw/*20.83*/("""
					"""),format.raw/*21.80*/("""
					
					"""),_display_(Seq[Any](/*23.7*/if(isProjetoAvaliado(projeto.id))/*23.40*/ {_display_(Seq[Any](format.raw/*23.42*/("""
								<span class="label label-success">Avaliado - """),_display_(Seq[Any](/*24.55*/getProjetoAvaliado(projeto.id)/*24.85*/.pontuacaoObtida)),format.raw/*24.101*/(""" Pontos Obtidos!</span>
					 """)))}/*25.9*/else/*25.14*/{_display_(Seq[Any](format.raw/*25.15*/("""
							    <span class="label label-important">Pendente!</span>
					        """)))})),format.raw/*27.15*/("""
					        
					 	
					</small>
					
						
				</h1>
				
				"""),_display_(Seq[Any](/*35.6*/if(isLogado())/*35.20*/ {_display_(Seq[Any](format.raw/*35.22*/("""
					"""),_display_(Seq[Any](/*36.7*/if(getUsuarioLogado().isAdministrador)/*36.45*/ {_display_(Seq[Any](format.raw/*36.47*/("""
					<div style="float:right; position:relative; top:8px;">
						<a href=""""),_display_(Seq[Any](/*38.17*/routes/*38.23*/.Projetos.editar(projeto.id))),format.raw/*38.51*/("""" class="btn"><i class="icon-edit"></i> Editar</a>
						<a href=""""),_display_(Seq[Any](/*39.17*/routes/*39.23*/.Projetos.deletar(projeto.id))),format.raw/*39.52*/("""" onclick="return confirm('Deseja realmente excluir o projeto &quot;"""),_display_(Seq[Any](/*39.121*/projeto/*39.128*/.titulo)),format.raw/*39.135*/("""&quot;?')" class="btn"><i class="icon-remove"></i> Excluir</a>
						""")))})),format.raw/*40.8*/("""
					
					"""),_display_(Seq[Any](/*42.7*/if(getUsuarioLogado().isGestor || getUsuarioLogado().isAdministrador || getUsuarioLogado().isAvaliador)/*42.110*/ {_display_(Seq[Any](format.raw/*42.112*/("""
					 <div style=" position:relative; top:35px;">
					    <a href=""""),_display_(Seq[Any](/*44.20*/routes/*44.26*/.Projetos.formularioAvaliacao(projeto.id))),format.raw/*44.67*/("""" class="btn btn-danger"><i class="icon-edit"></i> Avaliar esse Projeto </a>
					 </div>
					 """)))})),format.raw/*46.8*/("""
					
					</div>
					
				""")))})),format.raw/*50.6*/("""
			</div>
			
			<div class="row">
				<div class="span5">
					
					<div class="row">
						<div class="span5">
							<h3 class="page-header">Resumo:</h3>
							<pre>
								"""),_display_(Seq[Any](/*60.10*/projeto/*60.17*/.resumo)),format.raw/*60.24*/("""
							</pre>
						</div>
					</div>
					
					<div class="row">
						<div class="span5">
							<h3 class="page-header">Introdução:</h3>
							<pre>
								"""),_display_(Seq[Any](/*69.10*/projeto/*69.17*/.introducao)),format.raw/*69.28*/("""
							</pre>
						</div>
					</div>
				</div>
				
				<div class="span5 offset1">
						<div class="span5">
							<h3 class="page-header"> Fundamentação Teorica: </h3>
							<pre>
								"""),_display_(Seq[Any](/*79.10*/projeto/*79.17*/.fundamentacaoTeorica)),format.raw/*79.38*/("""
							</pre>
						</div>
						
						<div class="span5">
							<h3 class="page-header"> Justifivativa: </h3>
							<pre>
								"""),_display_(Seq[Any](/*86.10*/projeto/*86.17*/.justificativa)),format.raw/*86.31*/("""
							</pre>
						</div>
				 </div>
				 
				 <div class="span5">
					<div class="row">
						<div class="span5">
							<h3 class="page-header">Objetivos:</h3>
							<pre>
								"""),_display_(Seq[Any](/*96.10*/projeto/*96.17*/.objetivos)),format.raw/*96.27*/("""
							</pre>
						</div>
					</div>
					
					<div class="row">
						<div class="span5">
							<h3 class="page-header">Referencias:</h3>
							<pre>
								
								"""),_display_(Seq[Any](/*106.10*/projeto/*106.17*/.referencias)),format.raw/*106.29*/("""
							</pre>
						</div>
					</div>
				</div>
								 
				 <div class="span5 offset1">
												
						<div class="span5">
							<h3 class="page-header"> Metodologia: </h3>
							<pre>
								"""),_display_(Seq[Any](/*117.10*/projeto/*117.17*/.metodologia)),format.raw/*117.29*/("""
							</pre>
						</div>
				 </div>
					
				</div>
			</div>
		</div>
	</div>	


""")))})))}
    }
    
    def render(projeto:Projeto) = apply(projeto)
    
    def f:((Projeto) => play.api.templates.Html) = (projeto) => apply(projeto)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jan 05 16:47:09 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/Projetos/visualizar2.scala.html
                    HASH: d98221d1d0947aea4a92a7f0569de5f17bf7ca12
                    MATRIX: 771->1|988->19|1016->144|1055->149|1066->153|1104->155|1275->291|1291->298|1320->305|1382->331|1398->338|1437->355|1503->385|1519->392|1555->406|1611->511|1646->592|1696->607|1738->640|1778->642|1870->698|1909->728|1948->744|1998->777|2011->782|2050->783|2163->864|2276->942|2299->956|2339->958|2382->966|2429->1004|2469->1006|2584->1085|2599->1091|2649->1119|2753->1187|2768->1193|2819->1222|2925->1291|2942->1298|2972->1305|3074->1376|3124->1391|3237->1494|3278->1496|3386->1568|3401->1574|3464->1615|3594->1714|3659->1748|3886->1939|3902->1946|3931->1953|4141->2127|4157->2134|4190->2145|4433->2352|4449->2359|4492->2380|4671->2523|4687->2530|4723->2544|4958->2743|4974->2750|5006->2760|5228->2945|5245->2952|5280->2964|5534->3181|5551->3188|5586->3200
                    LINES: 27->1|37->1|38->6|40->8|40->8|40->8|46->14|46->14|46->14|48->16|48->16|48->16|49->17|49->17|49->17|52->20|53->21|55->23|55->23|55->23|56->24|56->24|56->24|57->25|57->25|57->25|59->27|67->35|67->35|67->35|68->36|68->36|68->36|70->38|70->38|70->38|71->39|71->39|71->39|71->39|71->39|71->39|72->40|74->42|74->42|74->42|76->44|76->44|76->44|78->46|82->50|92->60|92->60|92->60|101->69|101->69|101->69|111->79|111->79|111->79|118->86|118->86|118->86|128->96|128->96|128->96|138->106|138->106|138->106|149->117|149->117|149->117
                    -- GENERATED --
                */
            