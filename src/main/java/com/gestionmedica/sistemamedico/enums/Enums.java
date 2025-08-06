package com.gestionmedica.sistemamedico.enums;

public class Enums {

    public enum Especialidad {
        PEDIATRIA,
        MEDICINA_GENERAL,
        DERMATOLOGIA,
        CARDIOLOGIA,
        NEUROLOGIA,
        GINECOLOGIA
    }

    public enum EstadoDoctor {
        ACTIVO,
        INACTIVO
    }

    public enum DiaSemana {
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO
    }

    public enum EstadoCita {
        PROGRAMADA,
        CANCELADA,
        COMPLETADA
    }
}
