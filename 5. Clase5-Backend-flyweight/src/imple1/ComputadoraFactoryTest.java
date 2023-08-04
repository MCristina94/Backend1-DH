package imple1;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputadoraFactoryTest {
@Test
    void getComputadora(){
    Computadora computadora = ComputadoraFactory.getComputadora(TipoComputadoraEnum.WINDOWS);

    Assert.assertNotNull(computadora);
    Assert.assertEquals(2, computadora.getRam());
    Assert.assertEquals(128, computadora.getDiscoDuro());
    Assert.assertEquals(TipoComputadoraEnum.WINDOWS, computadora.getId());
    Assert.assertEquals(1, computadora.getContador());

    Computadora computadora2 = ComputadoraFactory.getComputadora(TipoComputadoraEnum.MAC);

    Assert.assertNotNull(computadora2);
    Assert.assertEquals(16, computadora2.getRam());
    Assert.assertEquals(500, computadora2.getDiscoDuro());
    Assert.assertEquals(TipoComputadoraEnum.MAC, computadora2.getId());
    Assert.assertEquals(1, computadora2.getContador());

    Computadora computadora3 = ComputadoraFactory.getComputadora(TipoComputadoraEnum.MAC);

    Assert.assertNotNull(computadora3);
    Assert.assertEquals(16, computadora3.getRam());
    Assert.assertEquals(500, computadora3.getDiscoDuro());
    Assert.assertEquals(TipoComputadoraEnum.MAC, computadora3.getId());
    Assert.assertEquals(2, computadora3.getContador());

}

}