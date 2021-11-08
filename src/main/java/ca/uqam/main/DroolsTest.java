package ca.uqam.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import ca.uqam.model.*;
import org.drools.compiler.compiler.DroolsParserException;
import org.drools.compiler.compiler.PackageBuilder;
import org.drools.core.RuleBase;
import org.drools.core.RuleBaseFactory;
import org.drools.core.WorkingMemory;

public class DroolsTest {

    public static void main(String[] args) throws DroolsParserException,
            IOException {
        DroolsTest droolsTest = new DroolsTest();
        droolsTest.executeDrools();
    }

    public void executeDrools() throws DroolsParserException, IOException {

        PackageBuilder packageBuilder = new PackageBuilder();

        String ruleFile = "/rules/MyRules.drl";
        InputStream resourceAsStream = getClass().getResourceAsStream(ruleFile);

        Reader reader = new InputStreamReader(resourceAsStream);
        packageBuilder.addPackageFromDrl(reader);
        org.drools.core.rule.Package rulesPackage = packageBuilder.getPackage();
        RuleBase ruleBase = RuleBaseFactory.newRuleBase();
        ruleBase.addPackage(rulesPackage);

        WorkingMemory workingMemory = ruleBase.newStatefulSession();

        //Jeu de test 1
        Kiosk kiosk1 = new Kiosk(KioskType.CarRental, true, Level.High, 10);
        //Jeu de test 2
        Kiosk kiosk2 = new Kiosk(KioskType.Parking, false, Level.Empty, 20);
        //Jeu de test 3
        Kiosk kiosk3 = new Kiosk(KioskType.CarRental, false, Level.Low, 30);

        Technician technician1 = new Technician(1);
        Representative representative1 = new Representative(2);

        workingMemory.insert(kiosk1);
        workingMemory.insert(kiosk2);
        workingMemory.insert(kiosk3);
        workingMemory.insert(technician1);
        workingMemory.insert(representative1);
        workingMemory.fireAllRules();
    }
}
