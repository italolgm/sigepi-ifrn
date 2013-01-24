
package views.html.Avaliador

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
object listaAvaliadores extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Usuario],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(avaliadores: List[Usuario]):play.api.templates.Html = {
        _display_ {import tags._

import helper._

import helpers.Seguranca.InformacoesUsuarioHelper._


Seq[Any](format.raw/*1.30*/("""

"""),format.raw/*6.1*/("""

"""),_display_(Seq[Any](/*8.2*/main/*8.6*/ {_display_(Seq[Any](format.raw/*8.8*/("""

"""),_display_(Seq[Any](/*10.2*/if(isLogado())/*10.16*/ {_display_(Seq[Any](format.raw/*10.18*/("""
		"""),_display_(Seq[Any](/*11.4*/if(getUsuarioLogado().isAdministrador)/*11.42*/ {_display_(Seq[Any](format.raw/*11.44*/("""
<div class="row">
		<div class="span12">
			<div class="page-header" style="overflow:hidden;">
				<h1 style="float:left;">Listagem dos Avaliadores</h1>
				
				<div style="float:right; position:relative; top:8px;">
					<a href=""""),_display_(Seq[Any](/*18.16*/routes/*18.22*/.Avaliadores.formulario)),format.raw/*18.45*/("""" class="btn"><i class="icon-plus"></i> Cadastrar Novo Avaliador</a>
				</div>
			</div>
			
			
			
			"""),_display_(Seq[Any](/*24.5*/if(avaliadores.size == 0)/*24.30*/ {_display_(Seq[Any](format.raw/*24.32*/("""
				<h3>Nenhum Avaliador cadastrado.</h3>			
			""")))}/*26.6*/else/*26.11*/{_display_(Seq[Any](format.raw/*26.12*/("""
				<table class="table table-bordered table-condensed table-striped">
	              <thead>
	                <tr>
	                  <th>Nome</th>
	                  <th>Email</th>
	                  <th>Login</th>
	                  <th>Campus</th>
	                  <th>Ações</th>
	                </tr>
	              </thead>
	              <tbody>
                	"""),_display_(Seq[Any](/*38.19*/for(avaliador <- avaliadores) yield /*38.48*/ {_display_(Seq[Any](format.raw/*38.50*/("""
	                <tr>
                		<td>"""),_display_(Seq[Any](/*40.24*/avaliador/*40.33*/.nome)),format.raw/*40.38*/("""</td>
                		<td>"""),_display_(Seq[Any](/*41.24*/avaliador/*41.33*/.email)),format.raw/*41.39*/("""</td>
                		<td>"""),_display_(Seq[Any](/*42.24*/avaliador/*42.33*/.login)),format.raw/*42.39*/("""</td>
                		<td>"""),_display_(Seq[Any](/*43.24*/avaliador/*43.33*/.campus.getNome)),format.raw/*43.48*/("""</td>
						<td style="width:15%;">
							<a href=""""),_display_(Seq[Any](/*45.18*/routes/*45.24*/.Avaliadores.formularioEdicao(avaliador.id))),format.raw/*45.67*/("""" class="btn btn-small"><i class="icon-edit"></i> Editar</a>
							<a href=""""),_display_(Seq[Any](/*46.18*/routes/*46.24*/.Avaliadores.deletar(avaliador.id))),format.raw/*46.58*/("""" onclick="return confirm('Deseja realmente excluir o avaliador &quot;"""),_display_(Seq[Any](/*46.129*/avaliador/*46.138*/.nome)),format.raw/*46.143*/("""&quot;?')" class="btn btn-small"><i class="icon-remove"></i> Excluir</a>
						</td>
	                </tr>
					""")))})),format.raw/*49.7*/("""
	              </tbody>
	            </table>
			""")))})),format.raw/*52.5*/("""
		</div>
	</div>	
	""")))})),format.raw/*55.3*/("""
	
	"""),_display_(Seq[Any](/*57.3*/if(getUsuarioLogado().isGestor)/*57.34*/{_display_(Seq[Any](format.raw/*57.35*/("""
	
	
	<div class="row">
		<div class="span12">
			<div class="page-header" style="overflow:hidden;">
				<h1 style="float:left;">Listagem dos Avaliadores</h1>
				
				<div style="float:right; position:relative; top:8px;">
					<a href=""""),_display_(Seq[Any](/*66.16*/routes/*66.22*/.Avaliadores.formulario)),format.raw/*66.45*/("""" class="btn"><i class="icon-plus"></i> Cadastrar Novo Avaliador</a>
				</div>
			</div>
			
			
			
			"""),_display_(Seq[Any](/*72.5*/if(avaliadores.size == 0)/*72.30*/ {_display_(Seq[Any](format.raw/*72.32*/("""
				<h3>Nenhum Avaliador cadastrado.</h3>			
			""")))}/*74.6*/else/*74.11*/{_display_(Seq[Any](format.raw/*74.12*/("""
				<table class="table table-bordered table-condensed table-striped">
	              <thead>
	                <tr>
	                  <th>Nome</th>
	                  <th>Email</th>
	                  <th>Login</th>
	                  <th>Campus</th>
	                  <th>Ações</th>
	                </tr>
	              </thead>
	              <tbody>
                	"""),_display_(Seq[Any](/*86.19*/for(avaliador <- avaliadores) yield /*86.48*/ {_display_(Seq[Any](format.raw/*86.50*/("""
                	
                	 """),_display_(Seq[Any](/*88.20*/if(isAvaliadorCampusIgual(avaliador.id))/*88.60*/{_display_(Seq[Any](format.raw/*88.61*/("""
                	 
		                <tr>
	                		<td>"""),_display_(Seq[Any](/*91.25*/avaliador/*91.34*/.nome)),format.raw/*91.39*/("""</td>
	                		<td>"""),_display_(Seq[Any](/*92.25*/avaliador/*92.34*/.email)),format.raw/*92.40*/("""</td>
	                		<td>"""),_display_(Seq[Any](/*93.25*/avaliador/*93.34*/.login)),format.raw/*93.40*/("""</td>
	                		<td>"""),_display_(Seq[Any](/*94.25*/avaliador/*94.34*/.campus.getNome)),format.raw/*94.49*/("""</td>
							<td style="width:15%;">
								<a href=""""),_display_(Seq[Any](/*96.19*/routes/*96.25*/.Avaliadores.formularioEdicao(avaliador.id))),format.raw/*96.68*/("""" class="btn btn-small"><i class="icon-edit"></i> Editar</a>
								<a href=""""),_display_(Seq[Any](/*97.19*/routes/*97.25*/.Avaliadores.deletar(avaliador.id))),format.raw/*97.59*/("""" onclick="return confirm('Deseja realmente excluir o avaliador &quot;"""),_display_(Seq[Any](/*97.130*/avaliador/*97.139*/.nome)),format.raw/*97.144*/("""&quot;?')" class="btn btn-small"><i class="icon-remove"></i> Excluir</a>
							</td>
		                </tr>
	                  """)))})),format.raw/*100.21*/("""
					""")))})),format.raw/*101.7*/("""
	              </tbody>
	            </table>
			""")))})),format.raw/*104.5*/("""
		</div>
	</div>	
		   
		   
		   
		   
		   
	
	
	
	""")))})),format.raw/*115.3*/("""
	
  """)))})),format.raw/*117.4*/("""

""")))})))}
    }
    
    def render(avaliadores:List[Usuario]) = apply(avaliadores)
    
    def f:((List[Usuario]) => play.api.templates.Html) = (avaliadores) => apply(avaliadores)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jan 05 16:47:08 BRST 2013
                    SOURCE: C:/Users/Alessandro/workspace/sigepi-ifrn2/app/views/Avaliador/listaAvaliadores.scala.html
                    HASH: 1de38634b51a4f03863b5d3bb7b6697b605146f9
                    MATRIX: 783->1|975->29|1005->121|1044->126|1055->130|1093->132|1133->137|1156->151|1196->153|1236->158|1283->196|1323->198|1599->438|1614->444|1659->467|1806->579|1840->604|1880->606|1950->659|1963->664|2002->665|2425->1052|2470->1081|2510->1083|2594->1131|2612->1140|2639->1145|2705->1175|2723->1184|2751->1190|2817->1220|2835->1229|2863->1235|2929->1265|2947->1274|2984->1289|3075->1344|3090->1350|3155->1393|3270->1472|3285->1478|3341->1512|3449->1583|3468->1592|3496->1597|3644->1714|3729->1768|3784->1792|3826->1799|3866->1830|3905->1831|4188->2078|4203->2084|4248->2107|4395->2219|4429->2244|4469->2246|4539->2299|4552->2304|4591->2305|5014->2692|5059->2721|5099->2723|5175->2763|5224->2803|5263->2804|5369->2874|5387->2883|5414->2888|5481->2919|5499->2928|5527->2934|5594->2965|5612->2974|5640->2980|5707->3011|5725->3020|5762->3035|5855->3092|5870->3098|5935->3141|6051->3221|6066->3227|6122->3261|6230->3332|6249->3341|6277->3346|6443->3479|6483->3487|6569->3541|6669->3609|6709->3617
                    LINES: 27->1|35->1|37->6|39->8|39->8|39->8|41->10|41->10|41->10|42->11|42->11|42->11|49->18|49->18|49->18|55->24|55->24|55->24|57->26|57->26|57->26|69->38|69->38|69->38|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|76->45|76->45|76->45|77->46|77->46|77->46|77->46|77->46|77->46|80->49|83->52|86->55|88->57|88->57|88->57|97->66|97->66|97->66|103->72|103->72|103->72|105->74|105->74|105->74|117->86|117->86|117->86|119->88|119->88|119->88|122->91|122->91|122->91|123->92|123->92|123->92|124->93|124->93|124->93|125->94|125->94|125->94|127->96|127->96|127->96|128->97|128->97|128->97|128->97|128->97|128->97|131->100|132->101|135->104|146->115|148->117
                    -- GENERATED --
                */
            