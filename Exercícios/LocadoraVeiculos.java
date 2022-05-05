importar  java . útil . Scanner ;


public  class  LocadoraVeículos {

	public  static  void  main ( String [] args ) {
		Scanner  leitura = novo  Scanner ( System . in );
		String  resp = "s" ;
		while ( resp . equals ( "s" )) {
			Sistema . fora . println ( "Informe seu veiculo: (m) para moto e (c) carro: " );
			String  tipo = leitura . próximaLinha ();
			if ( tipo . equals ( "m" )) {
				Moto  moto = nova  Moto ();
				Sistema . fora . println ( "Insira o Fabricante:" );
				String  Fabricante = leitura . próximaLinha ();
				Sistema . fora . println ( "Insira o Modelo:" );
				String  Modelo = leitura . próximaLinha ();
				Sistema . fora . println ( "Insira as Cilindradas:" );
				Cordas  Cilindradas = leitura . próximaLinha ();
				moto . dados ( Fabricante , Modelo , Cilindradas );
				Sistema . fora . println ( moto );
				Sistema . fora . println ( "Gostaria de cadastrar outro veículo? s/n" );
				resp = leitura . próximaLinha ();
			}
			else  if ( tipo . equals ( "c" )) {
				Carro  carro = novo  Carro ();
				Sistema . fora . println ( "Insira o Fabricante:" );
				String  Fabricante = leitura . próximaLinha ();
				Sistema . fora . println ( "Insira o Modelo:" );
				String  Modelo = leitura . próximaLinha ();
				carro . dados ( Fabricante , Modelo );
				Sistema . fora . println ( carro );
				Sistema . fora . println ( "Gostaria de cadastrar outro veículo? s/n" );
				resp = leitura . próximaLinha ();
			} senão {
				Sistema . fora . println ( "Comando inválido!" );
			}
		}
	}

}