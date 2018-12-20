$(function(){
	
	switch(menu) {
		
		case 'About Us':
			$('#about').addClass('active');
			break;
		
		case 'Contact Us':
			$('#contact').addClass('active');
			break;
		
		case 'Home':
			$('#home').addClass('active');
			break;
			
		case 'All Product':
			$('#productList').addClass('active');
			break;
			
		default:
			$('#productList').addClass('active');
		$('#a_'+menu).addClass('active');
			break;
	
	
	}
	
})
