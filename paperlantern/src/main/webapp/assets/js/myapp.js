$(function() {
	//solving active menu problem
	switch(menu) {
	
	case 'About Us':
		$('#about').addClass('active');
		break;
	case'Contact Us' :
		$('#contact').addClass('active');
		   break;
		default:
			$('#Home').addClass('active');
		break;
	}

});
