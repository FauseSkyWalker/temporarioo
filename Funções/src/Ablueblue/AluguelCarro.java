package Ablueblue;

import java.util.Optional;

@Service
public class AluguelCarroService {
	
	@Autowired
	private CarroRepository carros;
	
	
	
	public Carro findCarroByPlaca(String Placa){   
		
		AluguelCarro aluguel = new AluguelCarro();

        return carros.findByPlaca(Placa);}
	
	@Autowired
	private AluguelCarroRepository dia;
	
	
	
	public DiaI findDiaByData(LocalDate Data){  
		
		//localdate facilita na manipulação dos dias e meses
	
		
		AluguelCarro aluguel = new AluguelCarro();
		LocalDate data2 = aluguel.getDataDeEntrada();
		
		AluguelCarro aluguel = new AluguelCarro();
		LocalDate data1 = aluguel.getDataDeSaida();
		
		Data = data1 - data2;
		
		
        return Data;
	}
	
	
		
	
	//montar a função 
	
	 
   
    public float CarroDiaria(LocalDate Data,String Aluguel){
    	
    	
    	Aluguel = Data * Aluguel;
    		
    	return Aluguel;
    }
    
    

}
