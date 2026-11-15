# tools/

Project-specific scripts live here (e.g. a data scan reading the game's local
`Assets.zip`), each domain in its own subfolder with its own `AGENTS.md`
documenting the pipeline: sources read, post-processing rules, output schema.

Rules:
- A single script generates each output file; generated files are committed but
  never hand-edited.
- Regenerate and recommit on every `hytale_build` bump.
- Ignore generated JSON output in `.gitignore` only if it is reproducible and
  large; otherwise commit it so CI needs no game assets.
