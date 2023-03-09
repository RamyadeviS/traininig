var fatherNameError = document.getElementById("fathername-error");
var fromDistrictError = document.getElementById("fromDistrict-error");
var toDistrictError = document.getElementById("toDistrict-error");
var sourceError = document.getElementById("source-error");
var destinationError = document.getElementById("destination-error");
var passengersError = document.getElementById("passengers-error");
var vehicleNoError = document.getElementById("vehicleNo-error");
var mobileNoError = document.getElementById("mobileNo-error");
var ticketNoError = document.getElementById("ticketNo-error");
var vaccinationCertificateError = document.getElementById("vaccinationCertificate-error");

var text;
function fatherNameValid() {
	var fatherName = document.getElementById("FatherName").value;
	let fatherNameValidation = '^[A-Za-z]*$';
	if (fatherName === 0 || fatherName.trim() === "") {
		text = 'Father Name is required';
		fatherNameError.innerHTML = text;
		return false;
	}
	if (fatherName.length < 3) {
		text = 'Father Name should be greater than 3 characters';
		fatherNameError.innerHTML = text;
		return false;
	}
	if (!fatherName.match(fatherNameValidation)) {
		text = 'Invalid name';
		fatherNameError.innerHTML = text;
		return false;
	}
	fatherNameError.innerHTML = '<i class="fa-regular fa-circle-check"></i>';
	return true;
}
function fromDistrictValid() {
	var fromDistrict = document.getElementById("FromDistrict").value;
	let fromDistrictValidation = '^[A-Za-z]*$';
	if (fromDistrict === 0) {
		text = 'District Name is required';
		fromDistrictError.innerHTML = text;
		return false;
	}
	if (fromDistrict.length < 3) {
		text= 'District Name should be greater than 3 characters';
		fromDistrictError.innerHTML = text;
		return false;
	}
	if (!fromDistrict.match(fromDistrictValidation)) {
		text = 'Invalid Data';
		fromDistrictError.innerHTML = text;
		return false;
	}
	fromDistrictError.innerHTML = '<i class="fa-regular fa-circle-check"></i>';
	return true;
}
function toDistrictValid() {
	var toDistrict = document.getElementById("ToDistrict").value;
	let toDistrictValidation = '^[A-Za-z]*$';
	if (toDistrict === 0) {
		text = 'District Name is required ';
		toDistrictError.innerHTML = text;
		return false;
	}
	if (toDistrict.length < 3) {
		text = 'District Name should be greater than 3 characters';
		toDistrictError.innerHTML = text;
		return false;
	}
	if (!toDistrict.match(toDistrictValidation)) {
		text = 'Invalid Data';
		toDistrictError.innerHTML = text;
		return false;
	}
	toDistrictError.innerHTML = '<i class="fa-regular fa-circle-check"></i>';
	return true;
}
function sourceValid() {
	var source = document.getElementById("Source").value;
	let sourceValidation = '^[A-Za-z]*$';
	if (source === 0) {
		text = 'Source Name is required';
		sourceError.innerHTML = text;
		return false;
	}
	if (source.length < 3) {
		text = 'source should be greater than 3 characters';
		sourceError.innerHTML = text;
		return false;
	}
	if (!source.match(sourceValidation)) {
		text = 'Invalid Data';
		sourceError.innerHTML = text;
		return false;
	}
	sourceError.innerHTML = '<i class="fa-regular fa-circle-check"></i>';
	return true;
}
function destinationValid() {
	var destination = document.getElementById("Destination").value;
	let destinationValidation = '^[A-Za-z]*$';
	if (destination === 0) {
		text= 'Destination Name is required';
		destinationError.innerHTML = text;
		return false;
	}
	if (destination.length < 3) {
		text= 'Destination should be greater than 3 characters';
		destinationError.innerHTML = text;
		return false;
	}
	if (!destination.match(destinationValidation)) {
		text= 'Invalid Data';
		destinationError.innerHTML = text;
		return false;
	}
	destinationError.innerHTML = '<i class="fa-regular fa-circle-check"></i>';
	return true;
}
function passengersValidation() {
	var passengers = document.getElementById("NoOfPassengers").value;
	let passengersValid = "([0-4]+)";
	if (passengers === 0) {
		text= 'Passengers is required';
		passengersError.innerHTML = text;
		return false;
	}
	if (passengers.length > 1) {
		text= 'Passengers are 1 to 4 members only allowed';
		passengersError.innerHTML = text;
		return false;
	}

	if (!passengers.match(passengersValid)) {
		text= 'Invalid data';
		passengersError.innerHTML = text;
		return false;
	}
	passengersError.innerHTML = '<i class="fa-regular fa-circle-check"></i>';
	return true;
}
function vehicleNoValidation() {
	var vehicleNo = document.getElementById("VehicleNo").value;
		let vehicleNoValid = "([A-Z]+[0-9]+)";
	if (vehicleNo === 0) {
		text= 'vehicle Number cannot be empty';
		vehicleNoError.innerHTML = text;
		return false;
	}
	if (!vehicleNo.match(vehicleNoValid)) {
		text= 'Invalid vehicle Number';
		vehicleNoError.innerHTML = text;
		return false;
	}
	vehicleNoError.innerHTML = '<i class="fa-regular fa-circle-check"></i>';
	return true;
}
function mobileNoValidation() {
	var mobileNo = document.getElementById("MobileNo").value;
	let mobileNoValid = "\\d{10}";
	if (mobileNo === 0) {
		text= 'Mobile Number is required';
		mobileNoError.innerHTML = text;
		return false;
	}
	if (mobileNo.length < 10 || mobileNo.length > 10) {
		text= 'Mobile No must be contain 10 digits';
		mobileNoError.innerHTML = text;
		return false;
	}

	if (!mobileNo.match(mobileNoValid)) {
		text= 'Invalid mobile Number';
		mobileNoError.innerHTML = text;
		return false;
	}
	mobileNoError.innerHTML = '<i class="fa-regular fa-circle-check"></i>';
	return true;
}
function ticketNoValidation() {
	var ticketNo = document.getElementById("TicketNo").value;
	let ticketNoValid = "([a-z A-Z]+[0-9]+)";
	if (ticketNo === 0) {
		text= 'ticket is required';
		ticketNoError.innerHTML = text;
		return false;
	}
	if (ticketNo.length < 8) {
		text= 'Ticket No has been less than 8 characters';
		ticketNoError.innerHTML = text;
		return false;
	}

	if (!ticketNo.match(ticketNoValid)) {
		text= 'Invalid ticket Number';
		vehicleNoError.innerHTML = text;
		return false;
	}
	ticketNoError.innerHTML = '<i class="fa-regular fa-circle-check"></i>';
	return true;
}
function vaccinationCertificateValid() {
	var vaccinationCertificate = document.getElementById("VaccinationCertificate").value;
	let vaccinationCertificateValidation = '^[A-Za-z]*$';

	if (vaccinationCertificate === 0 || vaccinationCertificate.trim() === "") {
		text= 'Yes is required';
		vaccinationCertificateError.innerHTML = text;
		return false;
	}
	if (vaccinationCertificate === 'NA') {
		text= 'Vaccination certificate need compulsory!! E-pass cannot be filled without certificate';
		vaccinationCertificateError.innerHTML = text;
		return false;
	}

	if (!vaccinationCertificate.match(vaccinationCertificateValidation)) {
		text= 'Only allowed the Alphabets';
		vaccinationCertificateError.innerHTML = text;
		return false;
	}
	vaccinationCertificateError.innerHTML = '<i class="fa-regular fa-circle-check"></i>';
	return true;
}


