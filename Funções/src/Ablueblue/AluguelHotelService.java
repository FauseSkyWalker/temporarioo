package Ablueblue;

import java.util.Optional;

@Service
public class AluguelHotelService {
	
	@Autowired
	private AluguelHotelRepository hotel;
	
	
	
	public Hotel findHotelByNome(String Nome){   
		
		AluguelHotel aluguel = new AluguelHotel();

        return hotel.findByNome(Nome);}
	
	@Autowired
	private AluguelHotelRepository dia;
	
	
	
	public DiaI findDiaByData(LocalDate Data){  
		
		//localdate facilita na manipulação dos dias e meses
	
		
		AluguelHotel aluguel = new AluguelHotel();
		LocalDate data2 = aluguel.getDataDeEntrada();
		
		AluguelHotel aluguel = new AluguelHotel();
		LocalDate data1 = aluguel.getDataDeSaida();
		
		Data = data1 - data2;
		
		
        return Data;
	}
	
	
		
	
	//montar a função 
	
	 
   
    public float HotelDiaria(LocalDate Data,String Aluguel){
    
    
    			
    	Aluguel = Data * Aluguel;
    	
    	
    	
    	return Aluguel;
    	
    }
    
    

}
