package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FindSystemModelEquilibrium
 *
 * Full name:        System`FindSystemModelEquilibrium
 *
 *                   FindSystemModelEquilibrium[model] searches for an equilibrium to the model model.
 *                   FindSystemModelEquilibrium[model, {{{x , x  }, …}, {{u , u  }, …}, {{y , y  }, …}}] searches for an equilibrium, starting from the points x  = x  , u  = u   and y  = y  .
 *                                                         1   10          1   10          1   10                                                               i    i0   i    i0      i    i0
 *                   FindSystemModelEquilibrium[model, {x   v , …}, …] searches for an equilibrium, with variable x  constrained to have the value v  etc.
 * Usage:                                                1    1                                                     i                                i
 *
 * Options:          None
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FindSystemModelEquilibrium
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindSystemModelEquilibrium.html
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
 * Default value:    Options[FindSystemModelEquilibrium] := SortBy[WSM`FindSystemModelEquilibrium`PackagePrivate`patchOpts[Options[WSMLink`WSMFindEquilibrium], False], ToString[#1[[1]]] & ]
 *
 * Numeric values:   None
 */
fun findSystemModelEquilibrium(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindSystemModelEquilibrium", arguments.toMutableList(), options)
}
