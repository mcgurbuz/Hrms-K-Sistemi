package kodlamaio.odev6.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.odev6.business.abstracts.PositionsService;
import kodlamaio.odev6.entites.concretes.Positions;
//ÇOK ÖNEMLİ
	//Api isimlendirme kuralı gereği s takısı eklendi. Yani PositionController demek
	//yerine isimlendirme kuralı gereği PositionsController verdik bu class'ın ismini.
	//Controllerdan kast edilen şu dış dünya ile sistemimizin iletişim kurduğu yer Controller
	//classları kontrolden kast edilen istek nereden kimden geliyor bunu denetliyoruz yani 
	//Android bir uygulamadan da gelebilir istek Ios uygulamadan veya Web tarafında angular ile
	//yazılmış bir web sitesinden de gelebilir istek. Bizim backend tarafındaki kodlarımıza kim
	//erişmek istiyor bunu kontrol ediyor aslında. Bu class'ımın controller olduğunu ben RestController
	//anotasyonu ile söylüyorum.
	
	//Bu class'ın kontrolör olduğunu söyledikten sonra şunu yapmak lazım birden fazla kontrolör
	//olabilir örneğin bizim sistemimizde pozisyonlar için bir kontrolör ,üyeler ,kullanıcılar ,şirketler
	//vs. bunlar için ayrı kontrolörler olabilir. RequestMapping anotasyonu ile ben bu class'ımın pozisyonlar
	//için oluşturulmuş bir controller sınıfı olduğunu söylüyorum. Yani web tarafında domain/api/positions
	//diye bir istek gelirse bu isteği benim bu controller class'ım karşılayacak. Bu arada burada domain'den kast 
	//edilen sitenin ismi, sitenin ana sayfasına ulaşmak için web tarafına yazdığımız adres olarak düşünebiliriz.
	
	//ÇOK ÖNEMLİ
	//Benim apimin yani bu controller sınıfının datayı döndürebilmek adına business katmanıyla iletişim kurmasını istiyorum
	//ki zaten business katmanım da dataAccess katmanıyla iletişim halindeydi. Constructor injection yapmıştık. dataAccess
	//katmanımda ki interfaceler de JpaRepository'i extend ediyordu. Kısacası ben apimin business katmanıyla iletişim kurmasını
	//sağlarsam JpaRepository'nin bana sağladığı sorgulara erişebilirim.

@RestController //Sen bir RestControllersin
@RequestMapping("/api/positions") //kodlama.io(domain)/api/positions isteği gelirse bu controller karar verecek
public class PositionsController {
	//Katmanlar arası haberleşmeler interfacelerle yapılır. Benim apimin haberlşemesi gerekiyor.
	private PositionsService positionsService;
	//Burada kullandığum Autowired'da yine business katmanındaki kullandığım Autowired ile benzer şekilde çalışıyor.
	//Constructor injection yaparken bana bir tane PositionService tipinde bir nesne lazım. Autowired burada projeyi 
	//tarayacak ve PositionService'i implemente eden sınıfı buluyor. Bu sınıf PositionManager. Spring arka planda	
	//PositionsService'i implemente eden PositionManager'ı newliyor. Tam PositionManager'ı newlerken PositionsDao'ya 
	//ihtiyaç duyuyor ki PositionManager içerisinde cosntructor inejction ve Autowired ile ihitayaç duyulan PositionDao'ya
	//ait işlemlerde otomatikman gerçekleşiyor. Son durumda newlenmiş PositionManager objesini geliyor ve buradaki constructor'da yerleştiriyor.
	//Tüm bunları Autowired anotasyonu otomatik yapıyor. Bu olayda IOC(inversion of control) dediğimiz yapılandırma ile kullanılıyor.
		
	
	
	

	
	//Benim yerime newleyip projeyi tarıyor kim productService implement ediyor diye arıyor
	//Bakıyor arkada Product Manageri buluyor. Bizim newlememize gerek kalmıyor!!!
	@Autowired
	public PositionsController(PositionsService positionsService) {
		super();
		this.positionsService = positionsService;
	}
	
	
	//İstekler iki türlüdür. Bana veri ver yada şu veriyi değiştir. HTTP Request denir
	//Veri isterseniz GetMAPPİNG
	
	//Aşağıdaki metodum veri istemeye yönelik bir istek olduğu için GetMapping anotasyonu kullanıldı.
	//Son durumda domain/api/positions/getallpositions tarzında bir istekte bulunuyorum ve aşağıdaki
	//metodum çalışmış oluyor. 
	@GetMapping("/getall")
	public List<Positions> getAll(){
		
		return this.positionsService.getAll();
	}
	
	

}
