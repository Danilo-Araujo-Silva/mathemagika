package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**                                                                                     \!                                        " for n instances.
 *````                                                                                   *                   StyleBox["noun", "TI"] *                   Pluralize[{"singular", "plural"}, n] inflects using the specified forms.
 *                                                                                                                                   * Usage:            Pluralize[spec, list] uses the length of list to determine the inflection to use.
 * Name:             Pluralize                                                                                                       *
 *                                                                                                                                   * Options:          None
 * Full name:        System`Pluralize                                                                                                *
 *                                                                                                                                   *                   Protected
 *                   Pluralize["noun"] gives the plural form of the English word "noun".                                             * Attributes:       ReadProtected
 *                   Pluralize["noun", n] gives the inflected form of "                                                              *
                                                                                                                                     *                   local: paclet:ref/Pluralize
                                                                                                                                     * Documentation:    web: http://reference.wolfram.com/language/ref/Pluralize.html
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
fun pluralize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Pluralize", arguments.toMutableList(), options)
}
