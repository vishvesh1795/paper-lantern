$(function() {
	//solving active menu problem
	switch(menu) {
	
	case 'About Us':
		$('#about').addClass('active');
		break;
	case'Contact Us' :
		$('#contact').addClass('active');
		   break;
	case 'All Products' :
		$('#listproducts').addClass('active');
		   break;
		default:
			$('#listProducts').addClass('active');
		$('#a_'+menu).addClass('active');
		break;
	}

});
