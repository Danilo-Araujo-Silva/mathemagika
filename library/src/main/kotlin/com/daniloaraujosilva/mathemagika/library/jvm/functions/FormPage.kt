package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FormPage
 *
 * Full name:        System`FormPage
 *
 *                   FormPage[formspec, func] represents an active page that takes input from a form and generates results on the same page by applying func to the values obtained from the form whose structure is defined by formspec.
 *                   FormPage[{name   type , …}, func] represents an active form page with fields named name  interpreted as types type .
 *                                 1       1                                                                 i                          i
 *                   FormPage[{{name , label }  type , …}, func] uses label  as the label for the field named name .
 *                                  1       1        1                      i                                      i
 *                   FormPage[{namespec   type   default , …}, func] uses default  as the default for the field specified by namespec .
 *                                     1       1          1                        i                                                   i
 *                   FormPage[formspec, func, form] lays out the page according to the layout specification form.
 * Usage:            FormPage[formspec, func, initform  resform] uses initform as the initial layout specification and resform as the layout specification for result pages.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/FormPage
 * Documentation:    web: http://reference.wolfram.com/language/ref/FormPage.html
 *
 *                   FormPage[Forms`FormPage`PackagePrivate`f:AutoSubmitting[(_String?StringQ | {_String?StringQ, _} -> _) | (_String?StringQ | {_String?StringQ, _} :> _) | Association[(_String?StringQ | {_String?StringQ, _} -> _)...] | {((_String?StringQ | {_String?StringQ, _} -> _) | (_String?StringQ | {_String?StringQ, _} :> _))...} | (None | Null | _Missing | Missing | Automatic | "")] | ((_String?StringQ | {_String?StringQ, _} -> _) | (_String?StringQ | {_String?StringQ, _} :> _) | Association[(_String?StringQ | {_String?StringQ, _} -> _)...] | {((_String?StringQ | {_String?StringQ, _} -> _) | (_String?StringQ | {_String?StringQ, _} :> _))...} | (None | Null | _Missing | Missing | Automatic | "")), Forms`FormPage`PackagePrivate`args___, Forms`FormPage`PackagePrivate`opts:(Rule | RuleDelayed)[AllowedCloudExtraParameters | AllowedCloudParameterExtensions | AppearanceRules | FormLayoutFunction | ImageFormattingWidth | ImageSize | PageTheme | FormTheme | Forms`CumulativeDisplay, _]...] := Block[{Forms`PackageScope`$FormEvaluationEnvironment = FormPage}, FormPage[FormObject[Forms`PackageScope`toCompleteForm[Forms`FormPage`PackagePrivate`f], Forms`FormPage`PackagePrivate`opts], Forms`FormPage`PackagePrivate`args]]
 *                   FormPage[FormObject[Forms`FormPage`PackagePrivate`args1___], Forms`FormPage`PackagePrivate`args2___, Forms`FormPage`PackagePrivate`opts:(Rule | RuleDelayed)[AllowedCloudExtraParameters | AllowedCloudParameterExtensions | AppearanceRules | FormLayoutFunction | ImageFormattingWidth | ImageSize | PageTheme | FormTheme | Forms`CumulativeDisplay, _]...] /; Length[{Forms`FormPage`PackagePrivate`opts}] > 0 := Block[{Forms`PackageScope`$FormEvaluationEnvironment = FormPage}, FormPage[FormObject[Forms`FormPage`PackagePrivate`args1, Forms`FormPage`PackagePrivate`opts], Forms`FormPage`PackagePrivate`args2]]
 *                   FormPage[$Failed, Forms`FormPage`PackagePrivate`rest___] := $Failed
 * Definitions:      FormPage[Forms`FormPage`PackagePrivate`a:{___, Except[_Rule | _RuleDelayed], ___}, Forms`FormPage`PackagePrivate`args___, Forms`FormPage`PackagePrivate`rest:(Rule | RuleDelayed)[AllowedCloudExtraParameters | AllowedCloudParameterExtensions | AppearanceRules | FormLayoutFunction | ImageFormattingWidth | ImageSize | PageTheme | FormTheme | Forms`CumulativeDisplay, _]...] /; MemberQ[Head /@ Forms`FormPage`PackagePrivate`a, Rule | RuleDelayed] := FormPage[(FormObject[#1, FormLayoutFunction -> #2, Forms`FormPage`PackagePrivate`rest] & ) @@ Forms`PackageScope`synthetizeLayoutFunction[Forms`FormPage`PackagePrivate`a], Forms`FormPage`PackagePrivate`args]
 *
 * Own values:       None
 *
 *                   FormPage[Forms`FormPage`PackagePrivate`f:AutoSubmitting[(_String?StringQ | {_String?StringQ, _} -> _) | (_String?StringQ | {_String?StringQ, _} :> _) | Association[(_String?StringQ | {_String?StringQ, _} -> _)...] | {((_String?StringQ | {_String?StringQ, _} -> _) | (_String?StringQ | {_String?StringQ, _} :> _))...} | (None | Null | _Missing | Missing | Automatic | "")] | ((_String?StringQ | {_String?StringQ, _} -> _) | (_String?StringQ | {_String?StringQ, _} :> _) | Association[(_String?StringQ | {_String?StringQ, _} -> _)...] | {((_String?StringQ | {_String?StringQ, _} -> _) | (_String?StringQ | {_String?StringQ, _} :> _))...} | (None | Null | _Missing | Missing | Automatic | "")), Forms`FormPage`PackagePrivate`args___, Forms`FormPage`PackagePrivate`opts:(Rule | RuleDelayed)[AllowedCloudExtraParameters | AllowedCloudParameterExtensions | AppearanceRules | FormLayoutFunction | ImageFormattingWidth | ImageSize | PageTheme | FormTheme | Forms`CumulativeDisplay, _]...] := Block[{Forms`PackageScope`$FormEvaluationEnvironment = FormPage}, FormPage[FormObject[Forms`PackageScope`toCompleteForm[Forms`FormPage`PackagePrivate`f], Forms`FormPage`PackagePrivate`opts], Forms`FormPage`PackagePrivate`args]]
 *                   FormPage[FormObject[Forms`FormPage`PackagePrivate`args1___], Forms`FormPage`PackagePrivate`args2___, Forms`FormPage`PackagePrivate`opts:(Rule | RuleDelayed)[AllowedCloudExtraParameters | AllowedCloudParameterExtensions | AppearanceRules | FormLayoutFunction | ImageFormattingWidth | ImageSize | PageTheme | FormTheme | Forms`CumulativeDisplay, _]...] /; Length[{Forms`FormPage`PackagePrivate`opts}] > 0 := Block[{Forms`PackageScope`$FormEvaluationEnvironment = FormPage}, FormPage[FormObject[Forms`FormPage`PackagePrivate`args1, Forms`FormPage`PackagePrivate`opts], Forms`FormPage`PackagePrivate`args2]]
 *                   FormPage[$Failed, Forms`FormPage`PackagePrivate`rest___] := $Failed
 * Down values:      FormPage[Forms`FormPage`PackagePrivate`a:{___, Except[_Rule | _RuleDelayed], ___}, Forms`FormPage`PackagePrivate`args___, Forms`FormPage`PackagePrivate`rest:(Rule | RuleDelayed)[AllowedCloudExtraParameters | AllowedCloudParameterExtensions | AppearanceRules | FormLayoutFunction | ImageFormattingWidth | ImageSize | PageTheme | FormTheme | Forms`CumulativeDisplay, _]...] /; MemberQ[Head /@ Forms`FormPage`PackagePrivate`a, Rule | RuleDelayed] := FormPage[(FormObject[#1, FormLayoutFunction -> #2, Forms`FormPage`PackagePrivate`rest] & ) @@ Forms`PackageScope`synthetizeLayoutFunction[Forms`FormPage`PackagePrivate`a], Forms`FormPage`PackagePrivate`args]
 *
 *                   Setting[FormPage[(Forms`FormPage`PackagePrivate`fo_FormObject)?(Forms`PackageScope`specQ[FormObject]), Forms`FormPage`PackagePrivate`func_:Identity, Forms`FormPage`PackagePrivate`layout_:Automatic]] ^:= With[{Forms`FormPage`PackagePrivate`vals = Setting[Forms`FormPage`PackagePrivate`fo]}, If[FreeQ[Values[Forms`FormPage`PackagePrivate`vals], _Failure], Forms`FormPage`PackagePrivate`func[Forms`FormPage`PackagePrivate`vals], Failure["ValidationFailure", Append[Association["MessageTemplate" :> FormPage::invalidform, "Parameters" -> Forms`FormPage`PackagePrivate`vals, "FormObject" -> Forms`FormPage`PackagePrivate`fo], "Fields" -> Forms`FormPage`PackagePrivate`fo[All, All]]]]]
 * Up values:        HoldPattern[GenerateHTTPResponse][(Forms`GenerateHTTPResponse`PackagePrivate`obj_FormPage)?(Forms`PackageScope`specQ[FormPage])] ^:= Forms`GenerateHTTPResponse`PackagePrivate`handleExport[Forms`GenerateHTTPResponse`PackagePrivate`obj]
 *
 * Sub values:       FormPage[(Forms`FormPage`PackagePrivate`fo_FormObject)?(Forms`PackageScope`specQ[FormObject]), Forms`FormPage`PackagePrivate`func_:Identity, Forms`FormPage`PackagePrivate`layout_:Automatic][Forms`FormPage`PackagePrivate`input:(_String?StringQ -> _) | (_String?StringQ :> _) | Association[(_String?StringQ -> _)...] | {((_String?StringQ -> _) | (_String?StringQ :> _))...} | (None | Null | _Missing | Missing | Automatic | ""):<||>] := Block[{Forms`PackageScope`$FormEvaluationEnvironment = FormPage}, FormPage[Forms`FormPage`PackagePrivate`fo[Forms`FormPage`PackagePrivate`input], Forms`FormPage`PackagePrivate`func]]
 *
 * Default value:    Options[FormPage] := Options[FormObject]
 *
 * Numeric values:   None
 */
fun formPage(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FormPage", arguments.toMutableList(), options)
}
