package Ablueblue;

public class AluguelHotelController {

	package Ablueblue;

	public class carroAluguelControle {
		
		@Autowired 
		private AluguelHotelervice aluguelHotelervice;
		
		@GetMapping(value = "/Hotel/nome")
	    public ResponseEntity<Optional<Carro>> getCarroBynome(@PathVariable Long nome){
	    	
	    	Optional<Carro> Carro = Hotelervice.findAtivnomeadeBynome(nome);
	    	return new ResponseEntity<>(Carro, Carro == null  || Carro.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);
	    }
	    
		
	    @PostMapping(value = "/{nomeUser}/Hotel")
	    public ResponseEntity<Optional<Carro>> addCarro(@PathVariable Long nomeUser, @RequestBody Carro Carro){

	    	Optional<Carro> newAtivnomeade = Hotelervice.createCarro(nomeUser, Carro);
	    	return new ResponseEntity<>(newAtivnomeade, newAtivnomeade == null  || newAtivnomeade.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);
	    }
	    
	    @PutMapping(value = "/Carro/{nome}")
	    public ResponseEntity<Carro> updateCarro(@RequestBody CarroDTO CarroDTO, @PathVariable Long nome){

	        return new ResponseEntity<>(Hotelervice.updateAtivnomeade(CarroDTO, nome), HttpStatus.OK);
	    }
	    
	  
	    @DeleteMapping(value = "/Hotel/delete/{nome}")
	    public ResponseEntity<List<Carro>> deleteCarroBynome(@PathVariable Long nome){

	    	Hotelervice.deleteCarroBynome(nome);
	        return new ResponseEntity<>(HttpStatus.OK);
	    }
	}

	}

}
