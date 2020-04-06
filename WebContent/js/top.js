/**
 * 
 */

let classes = [ 'left', 'center', 'right', 'after1', 'after2', 'after3' ];
let timer = setInterval(function() {
	before();
}, 2000);
function before() {
	for (let i = 0; i < classes.length; i++) {
		$('.btn:eq(' + i + ')').css("background", "rgb(244,244,244)");
	}
	let last = classes.pop();
	classes.unshift(last);
	for (let i = 0; i < classes.length; i++) {
		$('#ul>li:eq(' + i + ')').attr("class", classes[i]);
	}
	for (let i = 0; i < classes.length; i++) {
		if ($('#ul>li:eq(' + i + ')').attr("class") == 'center') {
			$('.btn:eq(' + i + ')').css("background", "red");
		}
	}
}
function after() {
	for (let i = 0; i < classes.length; i++) {
		$('.btn:eq(' + i + ')').css("background", "rgb(244,244,244)");
	}
	let first = classes.shift();
	classes.push(first);
	for (let i = 0; i < classes.length; i++) {
		$('#ul>li:eq(' + i + ')').attr("class", classes[i]);
	}
	for (let i = 0; i < classes.length; i++) {
		if ($('#ul>li:eq(' + i + ')').attr("class") == 'center') {
			$('.btn:eq(' + i + ')').css("background", "red");
		}
	}
}
for (let i = 0; i < classes.length; i++) {
	(function(i) {
		$('#ul>li:eq(' + i + ')').click(function() {
			if ($('#ul>li:eq(' + i + ')').attr("class") == "left") {
				after();
			} else if ($('#ul>li:eq(' + i + ')').attr("class") == "right") {
				before();
			} else {
				return false;
			}
		});
		$('.btn:eq(' + i + ')').mouseover(function() {
			$('.btn:eq(' + i + ')').css("background", "red");
			clearInterval(timer);
			while (classes[i] != 'center') {
				before();
			}
		});
		$('.btn:eq(' + i + ')').mouseout(function() {
			$('.btn:eq(' + i + ')').css("background", "rgb(244,244,244)");
			clearInterval(timer);
			timer = setInterval(function() {
				before();
			}, 2000);
		});
	})(i);
}

$('.last').click(function() {
	clearInterval(timer);
	before();
	timer = setInterval(function() {
		before();
	}, 2000);
});
$('.next').click(function() {
	clearInterval(timer);
	after();
	timer = setInterval(function() {
		before();
	}, 2000);
});
$('.img').mouseover(function() {
	$('.last,.next').css("display", "block");
	clearInterval(timer);
});
$('.img').mouseout(function() {
	$('.last,.next').css("display", "none");
	clearInterval(timer);
	timer = setInterval(function() {
		before();
	}, 2000);
});