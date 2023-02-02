package Ablueblue;

import java.util.Optional;

@Service
public class AluguelHotelService {
	
	@Autowired
	private HotelRepository hotel;
	
	
	
	public Hotel findHotelByNome(String Nome){   
		
		AluguelHotel aluguel = new AluguelHotel();

        return hotel.findByNome(Nome);}
	
	@Autowired
	private HotelRepository diaI;
	
	
	
	public DiaI findDiaByDataDeEntrada(LocalDate Data){  
		
		AluguelHotel aluguel = new AluguelHotel();
		LocalDate data2 = aluguel.getDataDeEntrada();

        return diaI.findByDataDeEntrada(Data);}
	
	@Autowired
	private HotelRepository diaF;
	
	
	
	public DiaF findDiaByDataDeSaida(LocalDate Data){   
		
		AluguelHotel aluguel = new AluguelHotel();
		LocalDate data1 = aluguel.getDataDeSaida();
		
		

        return diaF.findByDataDeSaida(Data);}
    
	
	
	//montar a função 
	
	 
   
    public DiariaH HotelDiaria(data2,data1,aluguel){
    	
    	
    	float Vtotal;
    			
    	Vtotal = (data1 - data2) * aluguel;
    	
    	return Vtotal;
    	
    }
    
    

}
