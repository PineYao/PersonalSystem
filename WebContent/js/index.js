/**
 * 
 */
function getkey(a) {
	var search = document.getElementById("search").value;
	a.href='http://localhost:8080/PersonalSystem/Search?search='+search;
}