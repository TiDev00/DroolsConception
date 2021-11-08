# DroolsConception

This project is an implementation of a based rule system for a company managing automated Kiosks at airport.
We have 2 types of kiosks : those managing car rental payments and those managing parking payments.
The company has to manage also 2 types of employees : technicians and representatives.

* When there is a paper jam in a kiosk, the kiosk is unavailable. Technician must solve the paper jam 
for the kiosk to be available again.

* When there is no paper in a kiosk, the kiosk is unavailable. Representative must fill the paper for 
the kiosk to be available again.

* When the level of paper is low in a kiosk, the kiosk is available but representative must fill the 
paper.

