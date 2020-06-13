package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**                                                                                                                                                                                                                                                                                       \!                                                            ".
 *````                                                                                                                                                                                                                                                                                     *                                                       L1   R1 *
 *                                                                                                                                                                                                                                                                                         * Usage:            StyleBox["type", "TI"]                     *                   GridDensity -> 16
 * Name:             EquirippleFilterKernel                                                                                                                                                                                                                                                                                                                * Options:          WorkingPrecision -> MachinePrecision
 *                                                                                                                                                                                                                                                                                                                                                         *
 * Full name:        System`EquirippleFilterKernel                                                                                                                                                                                                                                                                                                         *                   Protected
 *                                                                                                                                                                                                                                                                                                                                                         * Attributes:       ReadProtected
 *                   EquirippleFilterKernel[{{{ω  , ω  }, {ω  , ω  }, …}, {a , a , …}}, n] creates a finite impulse response (FIR) filter kernel of length n with an equiripple amplitude response, given the specified left and right band edge frequencies {ω  , ω  } and amplitudes a .                                                                 *
 *                                              L1   R1     L2   R2         1   2                                                                                                                                                                              Li   Ri                  i                                                                  *                   local: paclet:ref/EquirippleFilterKernel
 *                   EquirippleFilterKernel[{{{ω  , ω  }, {ω  , ω  }, …}, {a , a , …}, {w , …}}, n] uses relative weights w  for each frequency band.                                                                                                                                                                                                      * Documentation:    web: http://reference.wolfram.com/language/ref/EquirippleFilterKernel.html
 *                                              L1   R1     L2   R2         1   2        1                                 i                                                                                                                                                                                                                               *
 *                   EquirippleFilterKernel[{"type", {{{ω  , ω  }, …}, …}, n] creates a filter of the specified "                                                                                                                                                                                                                                          * Definitions:      None
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
fun equirippleFilterKernel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EquirippleFilterKernel", arguments.toMutableList(), options)
}
