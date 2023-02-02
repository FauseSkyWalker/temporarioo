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
	private AluguelCarroRepository diaI;
	
	
	
	public DiaI findDiaByDataDeEntrada(LocalDate Data){  
		
		AluguelCarro aluguel = new AluguelCarro();
		LocalDate data2 = aluguel.getDataDeEntrada();

        return diaI.findByDataDeEntrada(Data);}
	
	@Autowired
	private AluguelCarroRepository diaF;
	
	
	
	public DiaF findDiaByDataDeSaida(LocalDate Data){   
		
		AluguelCarro aluguel = new AluguelCarro();
		LocalDate data1 = aluguel.getDataDeSaida();
		
		

        return diaF.findByDataDeSaida(Data);}
    
	
	
	//montar a função 
	
	 
   
    public DiariaC CarroDiaria(data2,data1,aluguel){
    	
    	
    	float Vtotal;
    			
    	Vtotal = (data1 - data2) * aluguel;
    	
    	return Vtotal;
    	
    }
    
    

}
