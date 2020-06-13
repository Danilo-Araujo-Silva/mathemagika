package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FormControl
 *
 * Full name:        System`FormControl
 *
 *                   FormControl[assoc, struct] represents an editable form in a notebook, with structure specified by struct and current values specified by assoc.
 * Usage:            FormControl[Dynamic[x], struct] represents a form in a notebook in which current values are given by the dynamically updated value of x.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/FormControl
 * Documentation:    web: http://reference.wolfram.com/language/ref/FormControl.html
 *
 * Definitions:      FormControl[Forms`FormControl`PackagePrivate`first_, Forms`FormControl`PackagePrivate`f:AutoSubmitting[(_String?StringQ | {_String?StringQ, _} -> _) | (_String?StringQ | {_String?StringQ, _} :> _) | Association[(_String?StringQ | {_String?StringQ, _} -> _)...] | {((_String?StringQ | {_String?StringQ, _} -> _) | (_String?StringQ | {_String?StringQ, _} :> _))...} | (None | Null | _Missing | Missing | Automatic | "")] | ((_String?StringQ | {_String?StringQ, _} -> _) | (_String?StringQ | {_String?StringQ, _} :> _) | Association[(_String?StringQ | {_String?StringQ, _} -> _)...] | {((_String?StringQ | {_String?StringQ, _} -> _) | (_String?StringQ | {_String?StringQ, _} :> _))...} | (None | Null | _Missing | Missing | Automatic | ""))] := FormControl[Forms`FormControl`PackagePrivate`first, FormObject[Forms`FormControl`PackagePrivate`f]]
 *
 * Own values:       None
 *
 * Down values:      FormControl[Forms`FormControl`PackagePrivate`first_, Forms`FormControl`PackagePrivate`f:AutoSubmitting[(_String?StringQ | {_String?StringQ, _} -> _) | (_String?StringQ | {_String?StringQ, _} :> _) | Association[(_String?StringQ | {_String?StringQ, _} -> _)...] | {((_String?StringQ | {_String?StringQ, _} -> _) | (_String?StringQ | {_String?StringQ, _} :> _))...} | (None | Null | _Missing | Missing | Automatic | "")] | ((_String?StringQ | {_String?StringQ, _} -> _) | (_String?StringQ | {_String?StringQ, _} :> _) | Association[(_String?StringQ | {_String?StringQ, _} -> _)...] | {((_String?StringQ | {_String?StringQ, _} -> _) | (_String?StringQ | {_String?StringQ, _} :> _))...} | (None | Null | _Missing | Missing | Automatic | ""))] := FormControl[Forms`FormControl`PackagePrivate`first, FormObject[Forms`FormControl`PackagePrivate`f]]
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun formControl(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FormControl", arguments.toMutableList(), options)
}
