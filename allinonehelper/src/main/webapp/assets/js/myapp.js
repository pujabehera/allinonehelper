$(function() {

	// solve the active menu problem
	switch (menu) {

	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'All Services':
		$('#listServices').addClass('active');
		break;
	default:
		$('#listServices').addClass('active');
		$('#a_'+menu).addClass('active');
		break;
	}
});