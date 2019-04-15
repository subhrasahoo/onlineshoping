//This function will be called automatically when doc is loaded.		
$(function(){
	//solving active menu prob.
	switch(menu){
	
	case 'About Us':
		$('#about').addClass( 'active' );
		break;
	case 'Contact Us':
		$('#contact').addClass( 'active' );
		break;
	default:
		$('#home').addClass( 'active' );
		break;
	}
	
});