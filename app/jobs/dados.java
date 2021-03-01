package jobs;

import models.Usuario;
import models.Postagem;
import play.jobs.Job;
import play.jobs.OnApplicationStart;


@OnApplicationStart
public class dados extends Job{
		
	@Override
	public void doJob() throws Exception {
		
		Usuario juvenal = new Usuario();
		juvenal.nome = "Juvens";
		juvenal.email = "juvens@localnet.br";
		juvenal.senha = "goku007";
		juvenal.Nascimento = 2020;	

		Usuario juba = new Usuario();
		juba.nome = "Juba";
		juba.email = "anejoestar@localnet.br";
		juba.senha = "speedwagongostosa01";
		juba.Nascimento = 2020;
		juba.save();
		juvenal.save();

		Postagem p = new Postagem();
		p.texto = "Undertale é massa";
		p.donoDaPostagem = juba;
		p.save();

		Postagem q = new Postagem();
		q.texto = "Flamengo porraaaaaaa";
		q.donoDaPostagem = juvenal;
		q.save();
	}
}
