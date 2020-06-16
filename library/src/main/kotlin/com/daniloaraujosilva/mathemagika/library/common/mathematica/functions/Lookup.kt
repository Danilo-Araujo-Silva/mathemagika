package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Lookup
 *
 * Full name:        System`Lookup
 *
 *                   Lookup[assoc, key] looks up the value associated with key in the association assoc; if the key is not present, Missing["KeyAbsent", key] is returned.
 *                   Lookup[assoc, {key , key , …}] gives a list of the values associated with the key .
 *                                     1     2                                                        i
 *                   Lookup[{assoc , assoc , …}, key] gives a list corresponding to the value of key in each assoc .
 *                                1       2                                                                       i
 *                   Lookup[assoc, key, default] gives default if the key is not present.
 *                   Lookup[assoc, keys, default, h] looks up the values associated with keys, wrapping each of then with head h before evaluation
 * Usage:            Lookup[key] represents an operator form of Lookup that can be applied to an expression.
 *
 * Options:          None
 *
 *                   HoldAllComplete
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Lookup
 * Documentation:    web: http://reference.wolfram.com/language/ref/Lookup.html
 *
 * Definitions:      Lookup[GraphStore`ArrayAssociation`Private`a_GraphStore`ArrayAssociation`ArrayAssociation, GraphStore`ArrayAssociation`Private`args__] := With[{GraphStore`ArrayAssociation`Private`res = Catch[GraphStore`ArrayAssociation`Private`iLookup[GraphStore`ArrayAssociation`Private`a, GraphStore`ArrayAssociation`Private`args], GraphStore`ArrayAssociation`Private`$failTag]}, GraphStore`ArrayAssociation`Private`res /; GraphStore`ArrayAssociation`Private`res =!= GraphStore`ArrayAssociation`Private`$failTag]
 *
 * Own values:       None
 *
 * Down values:      Lookup[GraphStore`ArrayAssociation`Private`a_GraphStore`ArrayAssociation`ArrayAssociation, GraphStore`ArrayAssociation`Private`args__] := With[{GraphStore`ArrayAssociation`Private`res = Catch[GraphStore`ArrayAssociation`Private`iLookup[GraphStore`ArrayAssociation`Private`a, GraphStore`ArrayAssociation`Private`args], GraphStore`ArrayAssociation`Private`$failTag]}, GraphStore`ArrayAssociation`Private`res /; GraphStore`ArrayAssociation`Private`res =!= GraphStore`ArrayAssociation`Private`$failTag]
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun lookup(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Lookup", arguments.toMutableList(), options)
}
