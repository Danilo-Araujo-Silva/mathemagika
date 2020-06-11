package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Style
 *
 * Full name:        System`Style
 *
 *                   Style[expr, options] displays with expr formatted using the specified option settings.
 *                   Style[expr, "style"] uses the option settings for the specified style in the current notebook.
 *                   Style[expr, color] displays using the specified color.
 *                   Style[expr, Bold] displays with fonts made bold.
 *                   Style[expr, Italic] displays with fonts made italic.
 *                   Style[expr, Underlined] displays with fonts underlined.
 *                   Style[expr, Larger] displays with fonts made larger.
 *                   Style[expr, Smaller] displays with fonts made smaller.
 *                   Style[expr, n] displays with font size n.
 * Usage:            Style[expr, Tiny], Style[expr, Small], etc. display with fonts that are tiny, small, etc.
 *
 *                   AdjustmentBoxOptions -> {BaseStyle -> {}, BoxBaselineShift -> 0., BoxMargins -> 0., DefaultBaseStyle -> {}, StripOnInput -> True}
 *                   AnimatorBoxOptions -> {Alignment -> {Automatic, Automatic}, AnimationDirection -> Forward, AnimationRate -> Automatic, AnimationRepetitions -> Infinity, Appearance -> {Automatic, Palette}, AppearanceElements -> {ProgressSlider, StepLeftButton, StepRightButton, PlayPauseButton, FasterSlowerButtons, DirectionButton}, AutoAction -> False, Background -> Automatic, BaseStyle -> {}, BaselinePosition -> Automatic, ContinuousAction -> True, DefaultBaseStyle -> {}, DefaultDuration -> 5., DisplayAllSteps -> False, Enabled -> Automatic, Exclusions -> {}, FrameMargins -> Automatic, ImageMargins -> 0, ImageSize -> Automatic, PausedTime -> Automatic, RefreshRate -> Automatic}
 *                   Antialiasing -> Automatic
 *                   AutoIndent -> Automatic
 *                   AutoItalicWords -> {Artlandia, AuthorTools, CalculationCenter, Combinatorica, DatabaseLink, Geometrica, Graphica, GUIKit, Magnetica, Mathematica, MathematicaMark, MathGroup, MathLink, MathLM, MathModelica, MathOptimizer, MathReader, MathSource, mathStatica, MathTensor, MATHwire, MathWorld, MonitorLM, Optica, PrimeKit, Publicon, SchematicSolver, ThreeScript, VisualDSolve}
 *                   AutoMultiplicationSymbol -> True
 *                   AutoNumberFormatting -> True
 *                   AutoQuoteCharacters -> {" -> {“, ”}, ' -> {‘, ’}}
 *                   AutoSpacing -> True
 *                   AutoStyleOptions -> {CommentStyle -> {FontColor -> RGBColor[0.27, 0.58, 0.68], ShowAutoStyles -> False, ShowSyntaxStyles -> False, AutoNumberFormatting -> False, TranslationOptions -> {Enabled -> False}, FontWeight -> Normal}, EmphasizedSyntaxErrorStyle -> {FontColor -> RGBColor[0.8, 0., 0.], Background -> RGBColor[1., 0.88, 0.51]}, ExcessArgumentStyle -> {FontColor -> RGBColor[1., 0.2, 0.2]}, FormattingErrorStyle -> {FontColor -> RGBColor[1., 0.33, 0.33], Background -> RGBColor[1., 0.33, 0.33, 0.15]}, FormattingErrorTooltips -> True, FunctionLocalVariableStyle -> {FontColor -> RGBColor[0.235, 0.49, 0.568]}, GlobalToLocalScopeConflictStyle -> {FontColor -> RGBColor[0.8, 0., 0.]}, GraphicsCompatibilityProblemStyle -> {FontColor -> RGBColor[1., 0.2, 0.2]}, HighlightComments -> True, HighlightEmphasizedSyntaxErrors -> True, HighlightExcessArguments -> True, HighlightFormattingErrors -> True, HighlightFunctionLocalVariables -> True, HighlightGlobalToLocalScopeConflicts -> True, HighlightGraphicsCompatibilityProblems -> True, HighlightLocalScopeConflicts -> True, HighlightLocalVariables -> True, HighlightMissingArguments -> True, HighlightMissingArgumentsWithTemplate -> False, HighlightMisspelledWords -> False, HighlightNoKernelPresent -> True, HighlightOrderOfEvaluationConflicts -> True, HighlightPatternVariables -> True, HighlightStrings -> True, HighlightSymbolContexts -> True, HighlightSymbolShadowing -> True, HighlightSyntaxErrors -> True, HighlightUndefinedSymbols -> True, HighlightUnknownOptions -> True, HighlightUnwantedAssignments -> True, LocalScopeConflictStyle -> {FontColor -> RGBColor[0.8, 0., 0.]}, LocalVariableStyle -> {FontColor -> RGBColor[0.263, 0.537, 0.345]}, MissingArgumentStyle -> {FontColor -> RGBColor[1., 0.2, 0.2]}, MissingArgumentTemplateStyle -> {FontColor -> GrayLevel[0.6], FontSlant -> Italic, ShowAutoStyles -> False, ShowSyntaxStyles -> False, AutoNumberFormatting -> False, TranslationOptions -> {Enabled -> False}, FontFamily -> Times, FontWeight -> Plain}, MisspelledWordStyle -> {FontColor -> RGBColor[0.76, 0.33, 0.8]}, NoKernelPresentStyle -> {FontColor -> RGBColor[0., 0., 0.4]}, OrderOfEvaluationConflictStyle -> {FontColor -> RGBColor[1., 0.2, 0.2]}, PatternVariableStyle -> {FontColor -> RGBColor[0.263, 0.537, 0.345], FontSlant -> Italic}, StringStyle -> {FontColor -> GrayLevel[0.4], ShowAutoStyles -> False, ShowSyntaxStyles -> False, AutoNumberFormatting -> False, TranslationOptions -> {Enabled -> False}}, SymbolContextStyles -> {System` -> {}, Global` -> {}, Automatic -> {}}, SymbolShadowingStyle -> {FontColor -> RGBColor[1., 0.2, 0.2]}, SyntaxErrorStyle -> {FontColor -> RGBColor[0.76, 0.33, 0.8]}, UndefinedSymbolStyle -> {FontColor -> RGBColor[0., 0.173, 0.765]}, UnknownOptionStyle -> {FontColor -> RGBColor[1., 0.2, 0.2]}, UnwantedAssignmentStyle -> {FontColor -> RGBColor[1., 0.2, 0.2]}}
 *                   AutoStyleWords -> {}
 *                   Background -> None
 *                   ButtonBoxOptions -> {Active -> True, Alignment -> {Automatic, Automatic}, Appearance -> {Automatic, Palette}, AutoAction -> False, Background -> Automatic, BaseStyle -> GenericButton, BaselinePosition -> Automatic, ButtonData -> Automatic, ButtonExpandable -> True, ButtonFrame -> Palette, ButtonFunction :> (FrontEndExecute[{FrontEnd`NotebookApply[FrontEnd`InputNotebook[], #1, Placeholder]}] & ), ButtonMargins -> 3, ButtonMinHeight -> 1., ButtonNote -> None, ButtonSource -> Automatic, ContinuousAction -> True, DefaultBaseStyle -> Button, Enabled -> Automatic, Evaluator -> None, FrameMargins -> Automatic, ImageMargins -> 0, ImageSize -> Full, Method -> Queued}
 *                   CacheGraphics -> Automatic
 *                   CellBaseline -> Baseline
 *                   CellContext -> Global`
 *                   CellEpilog -> None
 *                   CellEvaluationFunction -> Identity
 *                   CellFrameColor -> GrayLevel[0.]
 *                   CellFrameLabels -> {{None, None}, {None, None}}
 *                   CellProlog -> None
 *                   CharacterEncoding -> Automatic
 *                   CheckboxBoxOptions -> {Appearance -> {Automatic, Palette}, AutoAction -> False, Background -> Automatic, BaseStyle -> {}, BaselinePosition -> Automatic, ContinuousAction -> False, DefaultBaseStyle -> {}, Enabled -> Automatic, ImageMargins -> 0}
 *                   ClipPlanes -> None
 *                   ClipPlanesStyle -> Automatic
 *                   CodeAssistOptions -> {AttachedBrowserEnable -> True, AutoConvertEnable -> True, AutoPopupDelay -> 0., AutoPopupEnable -> True, CodeFoldingEnable -> False, CompletionParameters -> {0.85, 0.15, 7., 15., 0., 10., 20., 0., 10., -20., 20., -25., -10., -2., 0.6}, DynamicHighlighting -> True, FileCompleteEnable -> True, FloatingElementDelay -> 0.3, FloatingElementEnable -> True, HeadHighlightStyle -> {Background -> RGBColor[0.843, 1., 0.628]}, IncludedCompletions -> {Undocumented, Obsolete, Blacklisted}, MatchHighlightStyle -> {Background -> RGBColor[0.679, 0.937, 0.547]}, MatchingAlgorithm -> Automatic, MaxContextMatches -> 5, MaxGlobalMatches -> 5, MaxPlotThemeMatches -> 9, MenuBorderColor -> GrayLevel[0.925795], MinimalSize -> 2, PrimaryHoverColor -> RGBColor[0.91017, 0.652354, 0.636728], SecondaryHoverColor -> RGBColor[0.91017, 0.652354, 0.636728], StringCompleteEnable -> True}
 *                   ColorSetterBoxOptions -> {Appearance -> {Automatic, Palette}, AutoAction -> False, Background -> Automatic, BaseStyle -> {}, BaselinePosition -> Automatic, ContinuousAction -> True, DefaultBaseStyle -> {}, Enabled -> Automatic, ImageMargins -> 0, ImageSize -> Automatic}
 *                   ControlsRendering -> Automatic
 *                   ConversionRules -> None
 *                   Copyable -> True
 *                   CounterAssignments -> {}
 *                   CounterBoxOptions -> {BaseStyle -> {}, CounterFunction :> Identity, DefaultBaseStyle -> {}}
 *                   CounterIncrements -> {}
 *                   DefaultNaturalLanguage -> Automatic
 *                   DefaultNewInlineCellStyle -> None
 *                   DefaultOptions -> {}
 *                   Deletable -> True
 *                   DelimiterFlashTime -> 0.3
 *                   DelimiterMatching -> All
 *                   Deployed -> False
 *                   DigitBlock -> {3, 5}
 *                   DigitBlockMinimum -> {5, Infinity}
 *                   DynamicBoxOptions -> {Appearance -> {Automatic, Palette}, AutoAction -> False, Background -> Automatic, BaseStyle -> {}, CachedValue :> Null, ContinuousAction -> True, DefaultBaseStyle -> {}, Deinitialization :> None, DisplayFunction :> Identity, Editable -> False, Enabled -> Automatic, Evaluator -> Automatic, ImageSizeCache -> Automatic, Initialization :> None, BoxForm`RecursionLimit -> 256, Selectable -> Automatic, ShrinkingDelay -> 0., SynchronousUpdating -> True}
 *                   DynamicEvaluationTimeout -> 6.
 *                   DynamicModuleBoxOptions -> {BoxForm`ActionFunction :> None, BaseStyle -> {}, DefaultBaseStyle -> {}, Deinitialization :> None, DynamicModuleParent :> None, DynamicModuleValues :> None, Initialization :> None, SynchronousInitialization -> True, UnsavedVariables :> None, UntrackedVariables :> None, Value -> False}
 *                   DynamicUpdating -> Automatic
 *                   DynamicWrapperBoxOptions -> {Appearance -> {Automatic, Palette}, AutoAction -> False, Background -> Automatic, BaseStyle -> {}, CachedValue :> Null, ContinuousAction -> True, DefaultBaseStyle -> {}, Deinitialization :> None, DisplayFunction :> Identity, Editable -> False, Enabled -> Automatic, Evaluator -> Automatic, ImageSizeCache -> Automatic, Initialization :> None, BoxForm`RecursionLimit -> 256, Selectable -> Automatic, ShrinkingDelay -> 0., SynchronousUpdating -> True}
 *                   Editable -> True
 *                   EmphasizeSyntaxErrors -> False
 *                   Enabled -> True
 *                   ErrorBoxOptions -> {AutoDelete -> True, BaseStyle -> {}, DefaultBaseStyle -> {}, SaveAutoDelete -> False}
 *                   Evaluatable -> False
 *                   Evaluator -> Local
 *                   FontColor -> Automatic
 *                   FontFamily -> Times
 *                   FontOpacity -> Automatic
 *                   FontProperties -> {FontMonospaced -> Automatic, FontSerifed -> Automatic, ScreenResolution -> 72}
 *                   FontSize -> 12
 *                   FontSlant -> Plain
 *                   FontTracking -> Plain
 *                   FontVariations -> {CompatibilityType -> Normal, Outline -> False, Shadow -> False, StrikeThrough -> False, Underline -> False}
 *                   FontWeight -> Plain
 *                   FormatType -> TextForm
 *                   FormatTypeAutoConvert -> True
 *                   FormBoxOptions -> {BaseStyle -> {}, DefaultBaseStyle -> {}}
 *                   FractionBoxOptions -> {AllowScriptLevelChange -> True, BaseStyle -> {}, BoxForm`Beveled -> False, DefaultBaseStyle -> {}, BoxForm`DenominatorAlignment -> Center, FractionLine -> Automatic, MultilineFunction -> Automatic, BoxForm`NumeratorAlignment -> Center, BoxForm`Overhang -> 0.25}
 *                   FrameBoxOptions -> {Background -> Automatic, BaseStyle -> {}, BoxForm`BoxExpandable -> False, BoxFrame -> 1., DefaultBaseStyle -> {}, DefaultFrameStyle -> {}, FrameMargins -> 4., FrameStyle -> {}, ImageMargins -> 0., StripOnInput -> True}
 *                   GeometricTransformation3DBoxOptions -> {ContentSelectable -> Automatic}
 *                   GeometricTransformationBoxOptions -> {ContentSelectable -> Automatic}
 *                   Graphics3DBoxOptions -> {AlignmentPoint -> ImageScaled[{0.5, 0.5}], AspectRatio -> Automatic, Axes -> False, AxesEdge -> Automatic, AxesLabel -> None, AxesStyle -> {}, Background -> None, BaseStyle -> {}, BaselinePosition -> Automatic, BoxRatios -> Automatic, BoxStyle -> {}, Boxed -> True, ClipPlanes -> None, ColorOutput -> Automatic, ContentSelectable -> Automatic, ControllerLinking -> False, ControllerMethod -> Automatic, ControllerPath -> {Gamepad, Joystick, Detachable}, DefaultAxesStyle -> Graphics3DAxes, DefaultBaseStyle -> Graphics3D, DefaultBoxStyle -> Graphics3DBox, DefaultFaceGridsStyle -> Graphics3DFaceGrids, DefaultLabelStyle -> Graphics3DLabel, DefaultTicksStyle -> Graphics3DTicks, Epilog -> {}, FaceGrids -> None, FaceGridsStyle -> {}, FormatType -> TraditionalForm, ImageMargins -> 0., ImagePadding -> All, ImageSize -> Automatic, BoxForm`ImageSizeRules -> Automatic, LabelStyle -> {}, Lighting -> Automatic, Method -> {CylinderPoints -> {40, 3}, SpherePoints -> {40, 30}, RotationControl -> ArcBall}, PlotLabel -> None, PlotRange -> All, PlotRangePadding -> Automatic, PlotRegion -> {{0., 1.}, {0., 1.}}, Prolog -> {}, SphericalRegion -> Automatic, Ticks -> Automatic, TicksStyle -> {}, ViewAngle -> Automatic, ViewCenter -> Automatic, ViewMatrix -> Automatic, ViewPoint -> {1.3, -2.4, 2.}, ViewRange -> All, ViewVector -> Automatic, ViewVertical -> {0., 0., 1.}}
 *                   GraphicsBoxOptions -> {AlignmentPoint -> ImageScaled[{0.5, 0.5}], AspectRatio -> Automatic, Axes -> False, AxesLabel -> None, AxesOrigin -> {Automatic, Automatic}, AxesStyle -> {}, Background -> None, BaseStyle -> {}, BaselinePosition -> Automatic, ColorOutput -> Automatic, ContentSelectable -> Automatic, DefaultAxesStyle -> GraphicsAxes, DefaultBaseStyle -> Graphics, DefaultFrameStyle -> GraphicsFrame, DefaultFrameTicksStyle -> GraphicsFrameTicks, DefaultGridLinesStyle -> GraphicsGridLines, DefaultLabelStyle -> GraphicsLabel, DefaultTicksStyle -> GraphicsTicks, Epilog -> {}, FormatType -> TraditionalForm, Frame -> False, FrameLabel -> None, FrameStyle -> {}, FrameTicks -> Automatic, FrameTicksStyle -> {}, GridLines -> None, GridLinesStyle -> {}, ImageMargins -> 0., ImagePadding -> All, ImageSize -> Automatic, BoxForm`ImageSizeRules -> Automatic, LabelStyle -> {}, Method -> {}, PlotLabel -> None, PlotRange -> All, PlotRangeClipping -> False, PlotRangePadding -> Automatic, PlotRegion -> {{0., 1.}, {0., 1.}}, Prolog -> {}, RotateLabel -> True, Ticks -> Automatic, TicksStyle -> {}}
 *                   GraphicsComplex3DBoxOptions -> {BaseStyle -> {}, ContentSelectable -> Automatic, DefaultBaseStyle -> {}, VertexColors -> Automatic, VertexNormals -> Automatic}
 *                   GraphicsComplexBoxOptions -> {BaseStyle -> {}, ContentSelectable -> Automatic, DefaultBaseStyle -> {}, VertexColors -> Automatic}
 *                   GraphicsGroup3DBoxOptions -> {BaseStyle -> {}, ContentSelectable -> Automatic, DefaultBaseStyle -> {}}
 *                   GraphicsGroupBoxOptions -> {BaseStyle -> {}, ContentSelectable -> Automatic, DefaultBaseStyle -> {}}
 *                   BoxForm`GreekStyle -> None
 *                   GridBoxOptions -> {AllowScriptLevelChange -> True, AutoDelete -> True, BaseStyle -> {}, BaselinePosition -> Automatic, DefaultBaseStyle -> {}, DefaultFrameStyle -> {}, FrameStyle -> {}, GridBoxAlignment -> {}, GridBoxBackground -> {}, GridBoxDividers -> {}, GridBoxFrame -> {}, GridBoxItemSize -> {}, GridBoxItemStyle -> {}, GridBoxSpacings -> {}, GridDefaultElement -> , GridFrame -> False, GridFrameMargins -> {{0.4, 0.4}, {0.5, 0.5}}, MultilineFunction -> None}
 *                   HexahedronBoxOptions -> {BaseStyle -> {}, DefaultBaseStyle -> {}, VertexColors -> None, VertexTextureCoordinates -> None}
 *                   Hyphenation -> False
 *                   HyphenationOptions -> {HyphenationCharacter -> ‐, HyphenationFreeZone -> 36, HyphenationMinLengths -> {3, 3}}
 *                   IgnoreSpellCheck -> False
 *                   ImageSizeMultipliers -> {0.5, 0.25}
 *                   IndentMaxFraction -> 0.5
 *                   InputFieldBoxOptions -> {Alignment -> {Automatic, Automatic}, Appearance -> {Automatic, Palette}, Background -> Automatic, BaseStyle -> {}, BaselinePosition -> Automatic, ContinuousAction -> False, DefaultBaseStyle -> InputField, Enabled -> Automatic, FieldMasked -> False, FieldSize -> Automatic, FrameMargins -> Automatic, ImageMargins -> 0, ImageSize -> Automatic}
 *                   InsetBoxOptions -> {Alignment -> Left, Background -> None, BaseStyle -> {}, ContentSelectable -> Automatic, DefaultBaseStyle -> {}, FormatType -> Automatic}
 *                   InterpretationBoxOptions -> {AutoDelete -> False, BaseStyle -> {}, DefaultBaseStyle -> {}, DeletionWarning -> False, Editable -> False, BoxForm`InterpretationNote -> None, SelectWithContents -> False, Selectable -> Automatic, SyntaxForm -> Automatic}
 *                   ItemBoxOptions -> {Alignment -> {}, AllowScriptLevelChange -> True, Background -> Automatic, BaseStyle -> {}, DefaultBaseStyle -> {}, DefaultFrameStyle -> {}, Frame -> {}, FrameStyle -> {}, ItemSize -> {}, StripOnInput -> True}
 *                   LanguageCategory -> NaturalLanguage
 *                   Lighting -> Automatic
 *                   LimitsPositioningTokens -> {∑, ∏, ⋂, ⋃, ⊎, ⋀, ⋁, lim, max, min, ⊕, ⊖, ⊗, ⊙}
 *                   LinebreakAdjustments -> {0.85, 2., 12., 1., 1.}
 *                   LinebreakSemicolonWeighting -> PreferentiallyBreak
 *                   LineBreakWithin -> Automatic
 *                   LineIndent -> 1.
 *                   LineIndentMaxFraction -> 0.5
 *                   LineSpacing -> {1., 1., 2.}
 *                   ListPickerBoxOptions -> {Alignment -> {Automatic, Automatic}, Appearance -> Automatic, AppearanceElements -> None, AutoAction -> False, Background -> Automatic, BaseStyle -> {}, BaselinePosition -> Automatic, ContentPadding -> True, ContinuousAction -> True, DefaultBaseStyle -> ListPicker, Enabled -> Automatic, FieldSize -> {{1., 50.}, {1., 10.}}, FrameMargins -> Automatic, ImageMargins -> Automatic, ImageSize -> Automatic, ListPickerBoxBackground -> None, Multiselection -> True, ScrollPosition -> {0., 0.}, Scrollbars -> {Automatic, Automatic}, Spacings -> Automatic}
 *                   LocatorBoxOptions -> {Alignment -> {Automatic, Automatic}, Appearance -> {Automatic, Automatic}, AutoAction -> False, Background -> Automatic, BaseStyle -> {}, ContinuousAction -> True, DefaultBaseStyle -> {}, Enabled -> Automatic, FrameMargins -> 3., ImageMargins -> 0., ImageSize -> Automatic, LocatorCentering -> False, LocatorRegion -> Automatic}
 *                   LocatorPaneBoxOptions -> {Alignment -> {Automatic, Automatic}, Appearance -> Automatic, AutoAction -> False, Background -> Automatic, BaseStyle -> {}, BaselinePosition -> Automatic, ContinuousAction -> True, DefaultBaseStyle -> {}, Enabled -> Automatic, Exclusions -> {}, FrameMargins -> Automatic, ImageMargins -> 0, ImageSize -> Automatic, LocatorAutoCreate -> False, UseGraphicsRange -> All}
 *                   BoxForm`LowerCaseStyle -> None
 *                   Magnification -> 1.
 *                   MaintainDynamicCaches -> False
 *                   MultiLetterItalics -> False
 *                   MultiLetterStyle -> None
 *                   BoxForm`MultiscriptBoxOptions -> {AutoDelete -> True, BaseStyle -> {}, ColumnAlignments -> Center, ColumnSpacings -> 0.8, ColumnWidths -> Automatic, ColumnsEqual -> False, DefaultBaseStyle -> {}, DefaultElement -> , MultilineFunction -> None}
 *                   NumberMarks -> False
 *                   NumberMultiplier -> ×
 *                   NumberPoint -> .
 *                   NumberSeparator ->  
 *                   OpenerBoxOptions -> {Appearance -> {Automatic, Palette}, AutoAction -> False, Background -> Automatic, BaseStyle -> {}, BaselinePosition -> Automatic, ContinuousAction -> False, DefaultBaseStyle -> {}, Enabled -> Automatic, ImageMargins -> 0}
 *                   OptionValueBoxOptions -> {BaseStyle -> {}, DefaultBaseStyle -> {}}
 *                   OutputSizeLimit -> 1048576
 *                   OverlayBoxOptions -> {Alignment -> {Automatic, Automatic}, Background -> Automatic, BaseStyle -> {}, BaselinePosition -> Automatic, ContentPadding -> True, DefaultBaseStyle -> Overlay, FrameMargins -> Automatic, ImageMargins -> Automatic, ImageSize -> Automatic}
 *                   OverscriptBoxOptions -> {BaseStyle -> {}, DefaultBaseStyle -> {}, DiacriticalPositioning -> Automatic, LimitsPositioning -> Automatic, MultilineFunction -> Automatic}
 *                   PageFooters -> {{None, None, None}, {None, None, None}}
 *                   PageHeaders -> {{Cell[TextData[{CounterBox[Page]}]], None, Cell[TextData[{ValueBox[FileName]}]]}, {Cell[TextData[{ValueBox[FileName]}]], None, Cell[TextData[{CounterBox[Page]}]]}}
 *                   PaneBoxOptions -> {Alignment -> {Automatic, Automatic}, BaseStyle -> {}, BaselinePosition -> Automatic, DefaultBaseStyle -> Pane, Enabled -> Automatic, ImageMargins -> 0, ImageSize -> Automatic, ImageSizeAction -> Automatic, StripOnInput -> False}
 *                   PanelBoxOptions -> {Alignment -> {Automatic, Automatic}, Appearance -> {Automatic, Palette}, Background -> Automatic, BaseStyle -> {}, BaselinePosition -> Automatic, DefaultBaseStyle -> Panel, Enabled -> Automatic, FrameMargins -> Automatic, ImageMargins -> 0, ImageSize -> Automatic, BoxForm`PanelTitle -> None, StripOnInput -> False, BoxForm`TitleAlignment -> Automatic, BoxForm`TitlePositioning -> Top}
 *                   PaneSelectorBoxOptions -> {Alignment -> {Automatic, Automatic}, AutoAction -> False, Background -> Automatic, BaseStyle -> {}, BaselinePosition -> Automatic, ContinuousAction -> True, DefaultBaseStyle -> PaneSelector, FrameMargins -> Automatic, ImageMargins -> 0, ImageSize -> All}
 *                   ParagraphIndent -> 0
 *                   ParagraphSpacing -> {0., 0.}
 *                   PasteAutoQuoteCharacters -> {" -> {“, ”}, ' -> {‘, ’}}
 *                   Polygon3DBoxOptions -> {BaseStyle -> {}, DefaultBaseStyle -> {}, VertexColors -> Automatic, VertexNormals -> Automatic}
 *                   PolygonBoxOptions -> {BaseStyle -> {}, DefaultBaseStyle -> {}, VertexColors -> Automatic}
 *                   PopupMenuBoxOptions -> {Alignment -> {Automatic, Automatic}, Appearance -> {Automatic, Palette}, AutoAction -> False, Background -> Automatic, BaseStyle -> {}, BaselinePosition -> Automatic, ContinuousAction -> True, DefaultBaseStyle -> PopupMenu, Enabled -> Automatic, FieldSize -> {{1., 50.}, {1., 10.}}, FrameMargins -> Automatic, ImageMargins -> 0, ImageSize -> All, MenuAppearance -> {Automatic, Automatic}}
 *                   PrintPrecision -> 6
 *                   PrismBoxOptions -> {BaseStyle -> {}, DefaultBaseStyle -> {}, VertexColors -> None, VertexTextureCoordinates -> None}
 *                   PrivateFontOptions -> {FontPostScriptName -> Automatic, FontType -> Bitmap, IntegerLineheights -> False, OperatorSubstitution -> True, WindowsUseTrueTypeNames -> True}
 *                   ProgressIndicatorBoxOptions -> {Appearance -> {Automatic, Palette}, AutoAction -> False, Background -> Automatic, BaseStyle -> {}, BaselinePosition -> Automatic, ContinuousAction -> True, DefaultBaseStyle -> {}, Enabled -> Automatic, ImageMargins -> 0, ImageSize -> Automatic}
 *                   PyramidBoxOptions -> {BaseStyle -> {}, DefaultBaseStyle -> {}, VertexColors -> None, VertexTextureCoordinates -> None}
 *                   RadicalBoxOptions -> {BaseStyle -> {}, DefaultBaseStyle -> {}, ExponentPosition -> {0.2, 0.1}, MultilineFunction -> Automatic}
 *                   RadioButtonBoxOptions -> {Appearance -> {Automatic, Automatic}, AutoAction -> False, Background -> Automatic, BaseStyle -> {}, BaselinePosition -> Automatic, ContinuousAction -> True, DefaultBaseStyle -> {}, Enabled -> Automatic, ImageMargins -> 0}
 *                   Raster3DBoxOptions -> {BoxForm`AlphaMask -> None, BaseStyle -> {}, ClipRange -> None, ColorFunction -> Automatic, DefaultBaseStyle -> {}, BoxForm`ImageEditMode -> True, Method -> {InterpolateValues -> False}, PlotRange -> Automatic, PlotRangeClipPlanesStyle -> Automatic, VertexDataCoordinates -> Automatic}
 *                   RasterBoxOptions -> {BaseStyle -> {}, ColorFunction -> Automatic, ColorFunctionScaling -> True, DefaultBaseStyle -> {}, BoxForm`ImageEditMode -> True}
 *                   RenderingOptions -> {}
 *                   RotationBoxOptions -> {BaseStyle -> {}, BoxForm`BoxBaseline -> {0., 0.}, BoxRotation -> 0., DefaultBaseStyle -> {}}
 *                   ScriptBaselineShifts -> {Automatic, Automatic}
 *                   ScriptLevel -> 0
 *                   ScriptMinSize -> 4
 *                   ScriptSizeMultipliers -> {0.71}
 *                   Selectable -> True
 *                   SetterBoxOptions -> {Alignment -> {Automatic, Automatic}, Appearance -> {Automatic, Automatic}, AutoAction -> False, Background -> Automatic, BaseStyle -> {}, BaselinePosition -> Automatic, ContinuousAction -> True, DefaultBaseStyle -> {}, Enabled -> Automatic, FrameMargins -> Automatic, ImageMargins -> 0, ImageSize -> All}
 *                   ShowAutoConvert -> False
 *                   ShowAutoSpellCheck -> True
 *                   ShowAutoStyles -> True
 *                   ShowCodeAssist -> True
 *                   ShowContents -> True
 *                   ShowInvisibleCharacters -> {}
 *                   ShowSelection -> True
 *                   ShowSpecialCharacters -> True
 *                   ShowStringCharacters -> False
 *                   ShowSyntaxStyles -> True
 *                   SingleLetterItalics -> False
 *                   SingleLetterStyle -> None
 *                   Slider2DBoxOptions -> {Appearance -> {Automatic, Palette}, AutoAction -> False, Background -> Automatic, BaseStyle -> {}, BaselinePosition -> Automatic, ContinuousAction -> True, DefaultBaseStyle -> {}, Enabled -> Automatic, Exclusions -> {}, ImageMargins -> 0, ImageSize -> Automatic}
 *                   SliderBoxOptions -> {Appearance -> {Automatic, Automatic}, AutoAction -> False, Background -> Automatic, BaseStyle -> {}, BaselinePosition -> Automatic, ContinuousAction -> True, DefaultBaseStyle -> {}, Enabled -> Automatic, Exclusions -> {}, ImageMargins -> 0, ImageSize -> Automatic}
 *                   SpanAdjustments -> Automatic
 *                   SpanCharacterRounding -> Automatic
 *                   SpanLineThickness -> Automatic
 *                   SpanMaxSize -> Automatic
 *                   SpanMinSize -> Automatic
 *                   SpanSymmetric -> True
 *                   SqrtBoxOptions -> {BaseStyle -> {}, DefaultBaseStyle -> {0.2, 0.1}, MultilineFunction -> Automatic}
 *                   StripOnInput -> True
 *                   StyleBoxAutoDelete -> False
 *                   StyleHints -> {}
 *                   SubscriptBoxOptions -> {BaseStyle -> {}, DefaultBaseStyle -> {}, MultilineFunction -> Automatic}
 *                   SubsuperscriptBoxOptions -> {BaseStyle -> {}, DefaultBaseStyle -> {}, MultilineFunction -> Automatic}
 *                   SuperscriptBoxOptions -> {BaseStyle -> {}, DefaultBaseStyle -> {}, MultilineFunction -> Automatic}
 *                   TabFilling -> None
 *                   TableViewBoxOptions -> {Alignment -> {Automatic, Automatic}, AllowedDimensions -> Automatic, Appearance -> Automatic, AppearanceElements -> All, Background -> Automatic, BaseStyle -> {}, BaselinePosition -> Automatic, BoxForm`ColHeadersCollapsed -> False, BoxForm`ColSizes -> {}, ContentPadding -> True, DefaultBaseStyle -> TableView, Enabled -> Automatic, FieldSize -> {{1., 5.}, {1., 1.}}, FrameMargins -> Automatic, ImageMargins -> Automatic, ImageSize -> Automatic, BoxForm`RowHeadersCollapsed -> False, BoxForm`RowSizes -> {}, ScrollPosition -> {0., 0.}, Scrollbars -> {Automatic, Automatic}, Spacings -> Automatic, TableViewBoxBackground -> None, TableViewBoxItemSize -> {}, DefaultElement -> }
 *                   TabSpacings -> {4.}
 *                   TabViewBoxOptions -> {Alignment -> {Automatic, Automatic}, Appearance -> {Automatic, Palette}, AutoAction -> False, Background -> Automatic, BaseStyle -> {}, BaselinePosition -> Automatic, ContinuousAction -> True, ControlPlacement -> {Automatic, Automatic}, DefaultBaseStyle -> TabView, DefaultLabelStyle -> TabViewLabel, Enabled -> Automatic, FrameMargins -> Automatic, ImageMargins -> 0, ImageSize -> All, LabelStyle -> {}}
 *                   TagBoxOptions -> {AutoDelete -> False, BaseStyle -> {}, DefaultBaseStyle -> {}, DeletionWarning -> False, Editable -> Automatic, SelectWithContents -> False, Selectable -> Automatic, StripWrapperBoxes -> False, SyntaxForm -> Automatic, TagBoxNote -> None}
 *                   TaggingRules -> None
 *                   TemplateBoxOptions -> {BaseStyle -> {}, DefaultBaseStyle -> {}, SyntaxForm -> Automatic, BoxForm`Wrapper -> Null}
 *                   BoxForm`TemporaryControlActiveInterval -> 2.
 *                   TetrahedronBoxOptions -> {BaseStyle -> {}, DefaultBaseStyle -> {}, VertexColors -> None, VertexTextureCoordinates -> None}
 *                   Text3DBoxOptions -> {Background -> None, BaseStyle -> {}, DefaultBaseStyle -> {}, FormatType -> Automatic}
 *                   TextAlignment -> Left
 *                   TextJustification -> 0.
 *                   TogglerBoxOptions -> {Alignment -> {Automatic, Automatic}, Appearance -> {Automatic, Palette}, AutoAction -> False, Background -> Automatic, BaseStyle -> {}, BaselinePosition -> Automatic, ContinuousAction -> False, DefaultBaseStyle -> {}, Enabled -> Automatic, FrameMargins -> Automatic, ImageMargins -> 0, ImageSize -> All}
 *                   TooltipBoxOptions -> {TooltipDelay -> 0, BaseStyle -> {}, DefaultBaseStyle -> {}, DefaultLabelStyle -> TooltipLabel, LabelStyle -> {}, StripOnInput -> False}
 *                   TraditionalFunctionNotation -> False
 *                   TranslationOptions -> {BaseStyle -> Translation, ContentEnabled -> False, Enabled -> True, HighlightStyle -> SelectedTranslation, Language -> Automatic, Margins -> {{5, 6}, {2, 2}}}
 *                   UnderoverscriptBoxOptions -> {BaseStyle -> {}, DefaultBaseStyle -> {}, DiacriticalPositioning -> Automatic, LimitsPositioning -> Automatic, MultilineFunction -> Automatic}
 *                   UnderscriptBoxOptions -> {BaseStyle -> {}, DefaultBaseStyle -> {}, DiacriticalPositioning -> Automatic, LimitsPositioning -> Automatic, MultilineFunction -> Automatic}
 *                   UndoOptions -> {Enabled -> Automatic, MaxLength -> Infinity, MemoryLimit -> 10000000, RememberEvaluations -> True, SpoolDirectory -> FrontEnd`FileName[{$TemporaryPrefix}]}
 *                   VirtualGroupData -> None
 * Options:          ZeroWidthTimes -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Style
 * Documentation:    web: http://reference.wolfram.com/language/ref/Style.html
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
fun style(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Style", arguments.toMutableList(), options)
}
