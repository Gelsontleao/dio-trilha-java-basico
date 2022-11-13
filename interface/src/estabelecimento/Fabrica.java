package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.copiadora.Xerox;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	
	public static void main(String[] args) {
		
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
//		Impressora impressora = new Deskjet();
//		Impressora impressora1 = new EquipamentoMultifuncional();
//		Digitalizadora digitalizadora = new Scanner();
//		Copiadora copiadora = new Xerox();
//		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
		
		
		
	}

}
