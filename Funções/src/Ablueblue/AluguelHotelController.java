package Ablueblue;

public class carroAluguelControle {
	
	@Autowired 
	private AluguelHotelService aluguelCarroService;
	
	@GetMapping(value = "/hoteis/{nome}")
    public ResponseEntity<Hotel> getHotelByplaca(@PathVariable String nome){
    	
		Hotel Hotel = HotelService.findHotelByNome(nome);
    	return new ResponseEntity<>(Hotel, Hotel == null  || Hotel.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);
    }
    
	
    @PostMapping(value = "/hoteis/{nome}")
    public <Hotel> addHotel(@PathVariable String nomeUser, @RequestBody Hotel Hotel){

    	<Hotel> newNome = HotelService.createHotel(nomeUser, Hotel);
    	return new ResponseEntity<>(newNome, newNome == null  || newNome.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);
    
    	<Hotel> newData = HotelService.createHotel(DataEntrada, Hotel);
    	return new ResponseEntity<>(newData, neData == null  || newData.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);
    
    	<Hotel> newData = HotelService.createHotel(DataSaida, Hotel);
    	return new ResponseEntity<>(newData, neData == null  || newData.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);
    }
    
    }
}

}
