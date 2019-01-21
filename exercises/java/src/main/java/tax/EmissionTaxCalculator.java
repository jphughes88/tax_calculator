package tax;

public class EmissionTaxCalculator extends TaxCalculator {
    @Override
    int calculateTax(Vehicle vehicle) {
        int vehicleEmissions = vehicle.getCo2Emissions();
        FuelType fuelType = vehicle.getFuelType();
   
        int taxAmount = 0;

        if (fuelType == FuelType.PETROL){
            taxAmount = calculatePetrolTax(vehicleEmissions);
        } else if (fuelType == FuelType.ALTERNATIVE_FUEL){
            taxAmount = calculateAltFuelTax(vehicleEmissions);
        } else {
          taxAmount = calculateDieselTax(vehicleEmissions);
        }
        return taxAmount;
    }

    private int calculateAltFuelTax(int vehicleEmissions) {
        if (vehicleEmissions >= 0 && vehicleEmissions <= 50) {
            return 0;
        } else if (vehicleEmissions >= 51 && vehicleEmissions <= 75) {
            return 15;
        } else if (vehicleEmissions >= 76 && vehicleEmissions <= 90) {
            return 95;
        } else if (vehicleEmissions >= 91 && vehicleEmissions <= 100) {
            return 115;
        } else if (vehicleEmissions >= 101 && vehicleEmissions <= 110) {
            return 135;
        } else if (vehicleEmissions >= 111 && vehicleEmissions <= 130) {
            return 155;
        } else if (vehicleEmissions >= 131 && vehicleEmissions <= 150) {
            return 195;
        } else if (vehicleEmissions >= 151 && vehicleEmissions <= 170) {
            return 505;
        } else if (vehicleEmissions >= 171 && vehicleEmissions <= 190) {
            return 820;
        } else if (vehicleEmissions >= 191 && vehicleEmissions <= 225) {
            return 1230;
        } else if (vehicleEmissions >= 226 && vehicleEmissions <= 255) {
            return 1750;
        } else { return 2060; }
    }

 
    private int calculateDieselTax(int vehicleEmissions) {
        if (vehicleEmissions == 0) {
            return 0;
        } else if (vehicleEmissions >= 1 && vehicleEmissions <= 50) {
            return 25;
        } else if (vehicleEmissions >= 51 && vehicleEmissions <= 75) {
            return 105;
        } else if (vehicleEmissions >= 76 && vehicleEmissions <= 90) {
            return 125;
        } else if (vehicleEmissions >= 91 && vehicleEmissions <= 100) {
            return 145;
        } else if (vehicleEmissions >= 101 && vehicleEmissions <= 110) {
            return 165;
        } else if (vehicleEmissions >= 111 && vehicleEmissions <= 130) {
            return 205;
        } else if (vehicleEmissions >= 131 && vehicleEmissions <= 150) {
            return 515;
        } else if (vehicleEmissions >= 151 && vehicleEmissions <= 170) {
            return 830;
        } else if (vehicleEmissions >= 171 && vehicleEmissions <= 190) {
            return 1240;
        } else if (vehicleEmissions >= 191 && vehicleEmissions <= 225) {
            return 1760;
        } else if (vehicleEmissions >= 226 && vehicleEmissions <= 255) {
            return 2070;
        } else {
            return 2070;
        }
    }


    public int calculatePetrolTax(int vehicleEmissions) {

        if (vehicleEmissions == 0) {
            return 0;
        } else if (vehicleEmissions >= 1 && vehicleEmissions <= 50) {
            return 10;
        } else if (vehicleEmissions >= 51 && vehicleEmissions <= 75) {
            return 25;
        } else if (vehicleEmissions >= 76 && vehicleEmissions <= 90) {
            return 105;
        } else if (vehicleEmissions >= 91 && vehicleEmissions <= 100) {
            return 125;
        } else if (vehicleEmissions >= 101 && vehicleEmissions <= 110) {
            return 145;
        } else if (vehicleEmissions >= 111 && vehicleEmissions <= 130) {
            return 165;
        } else if (vehicleEmissions >= 131 && vehicleEmissions <= 150) {
            return 205;
        } else if (vehicleEmissions >= 151 && vehicleEmissions <= 170) {
            return 515;
        } else if (vehicleEmissions >= 171 && vehicleEmissions <= 190) {
            return 830;
        } else if (vehicleEmissions >= 191 && vehicleEmissions <= 225) {
            return 1240;
        } else if (vehicleEmissions >= 226 && vehicleEmissions <= 255) {
            return 1760;

        } else { return 2070; }
    }

}
