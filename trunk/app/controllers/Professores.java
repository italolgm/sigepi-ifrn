package controllers;


import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import java.util.List;
import java.util.Date;

import models.Bolsista;
import models.Projeto;




public class Professores extends Controller{
	
	private static final Form<Projeto> projetoForm = form(Projeto.class);

	public static Result index(){
		return ok(views.html.Professor.index.render());
	}
	
	public static Result submeterProjeto(){
		return ok(views.html.Professor.submeterProjeto.render());
	}
	
	public static Result curriculo(){
	    return ok(views.html.Professor.curriculo.render());
	}
	
	public static Result atualizarCurriculo(){
		return ok(views.html.Professor.atualizarCurriculo.render());
	}
	
	public static Result gerenciarProjeto(){
		List<Projeto> projetos = Projeto.find.where().findList();
		return ok(views.html.Professor.gerenciarProjeto.render(projetos));
	
		
	}
	
	public static Result formularioCadastrarProjeto(){	
		return ok(views.html.Professor.formularioCadastrarProjeto.render(projetoForm));
	}
	
	public static Result salvarCadastroProjeto() {
		
		Form<Projeto> pForm = projetoForm.bindFromRequest();
		if(pForm .hasErrors()){
			flash("error", "Dados inválidos!");
			return badRequest(views.html.Professor.formularioCadastrarProjeto.render(pForm));
		}
		//armazena no BD
		pForm.get().save();
        flash("success", "Projeto " + pForm.get().nome + " foi Cadastrado(a) com Sucesso!");
        return redirect(routes.Professores.gerenciarProjeto());
		
	}
	
	
	public static Result formularioEdicaoProjeto(Long id){
		Form<Projeto> pForm = form(Projeto.class).fill(Projeto.find.byId(id));
		return ok(views.html.Professor.formularioEdicaoProjeto.render(id, pForm));
	}
	

    public static Result update(Long id) {
        Form<Projeto> pForm = form(Projeto.class).bindFromRequest();
        if(pForm.hasErrors()) {
            return badRequest(views.html.Professor.formularioEdicaoProjeto.render(id, pForm));
        }
        //Atualiza no BD.
        pForm.get().update(id);
        flash("success", "Projeto " + pForm.get().nome + " foi Atualizado(a) com Sucesso!");
        return redirect(routes.Professores.gerenciarProjeto());
   
    }
    
    /**
     * Handle computer deletion
     */
    public static Result deletarProjeto(Long id) {
           
        Projeto projeto = Projeto.find.byId(id);
        	
		if (projeto == null) {
			flash().put("error", "O projeto não foi encontrado no sistema.");
		} else {
			projeto.delete();
						
			flash().put("success", "Projeto \""+ projeto.nome +"\" removido(a) com sucesso!");
		}
	
		return redirect(routes.Professores.gerenciarProjeto());
    }
}