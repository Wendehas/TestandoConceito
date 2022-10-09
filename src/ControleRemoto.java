
public class ControleRemoto implements Contralador {
//	atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto() {
//		metodos especiais
		this.setVolume(20);
		this.setLigado(true); 
		this.setTocando(false);
	}
//	 méttodos especias (GETTERS E SETTERS)
	
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = true;
	}

	public boolean isTocando()  {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
//	metodos abstract

	@Override
	public void ligar() {
		this.setLigado(true);
		
	}

	@Override
	public void desligar() {
		this.setLigado(false);
		
	}


	@Override
	public void abrirMenu() {
		System.out.println("-------------MENU--------------");
		System.out.println("Está ligado ? " + this.isLigado());
//		System.out.println("Está ligado ? " + this.ligado);
		System.out.println("Está tocando ? " + this.isTocando());
//		System.out.println("Está tocando ? " + this.tocando);
		System.out.print("Volume : " + this.getVolume());
//		System.out.print("Volume : " + this.volume);
		for (int i = 0; i <= this.getVolume(); i+=10) {
			System.out.print("|");
			
		}
		System.out.println("");
		
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando menu...");
	
		
	}

	@Override
	public void maisVolume() {
		if(this.isLigado()) {
			this.setVolume(this.getVolume() + 5);
		}else{
			System.out.println("Impossivel aumentar volume");
		}
		
	}

	@Override
	public void menosVolume() {
		if(this.isLigado()) {
			this.setVolume(this.getVolume() - 5);
		}else{
			System.out.println("Impossivel diminuir volume");
		}
	
		
	}

	@Override
	public void ligaMudo() {
		if(this.isLigado() && this.getVolume() > 0);
		   this.setVolume(0);
		
		
	}

	@Override
	public void desligarMudo() {
			if(this.isLigado() && this.getVolume() == 0);
			   this.setVolume(50);
			
	}

	@Override
	public void play() {
		if(this.isLigado() && !(this.isTocando())) {
		   this.setTocando(true);
		   }
	else {
		System.out.println("Impossivel realizar ação !");
	}
	}


		
	
	@Override
	public void pause() {
		if(this.isLigado() && this.isTocando()) {
		   this.setTocando(false);
	}
	else {
		System.out.println("Impossivel realizar ação !");
	}
	
	}

}
