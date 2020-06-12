package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PeriodicBoundaryCondition
 *
 * Full name:        System`PeriodicBoundaryCondition
 *
 *                   PeriodicBoundaryCondition[u[x , …], pred, f] represents a periodic boundary condition u(x      ) = u(f(x      )) for all x       on the boundary of the region given to NDSolve where pred is True.
 *                                                1                                                           target         target            target
 *                   PeriodicBoundaryCondition[a + b u[x , …], pred, f] represents a generalized periodic boundary condition u(x      ) = a + b u(f(x      )).
 * Usage:                                               1                                                                       target               target
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PeriodicBoundaryCondition
 * Documentation:    web: http://reference.wolfram.com/language/ref/PeriodicBoundaryCondition.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun periodicBoundaryCondition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PeriodicBoundaryCondition", arguments.toMutableList(), options)
}
